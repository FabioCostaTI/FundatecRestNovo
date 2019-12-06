package br.com.fundatec.carro.service;

import br.com.fundatec.carro.Repository.CarroRepository;
import br.com.fundatec.carro.model.Carro;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class CarroService {
    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listaCarros(String nome) {

        return carroRepository.findByNomeContainingIgnoreCase(nome);
    }

    public Carro consultar(Long id) {

        return carroRepository.findById(id).orElse(null);
    }

    public Carro incluir(Carro carro) {
        validar(carro);
        return carroRepository.save(carro);
    }

    private void validar(Carro carro) {
        if (carro.getDataModelo().isBefore(carro.getDataFabricacao())) {
            throw new RuntimeException("Data de Fabricação não pode " + " ser maior que data modelo.");

        }
        List<String> marcasValidas = Arrays.asList("Fiat", "Ford", "Vokswagen","Peugeot");
        if (! marcasValidas.contains(carro.getMarca())){
            throw new RuntimeException("A marca " + carro.getMarca() + " é inválida." );
        }
    }

    public List<Carro> listaCarros(LocalDate dataInicio, LocalDate dataFim) {
        return carroRepository.findByDataFabricacaoBetween(dataInicio, dataFim);
    }
}
