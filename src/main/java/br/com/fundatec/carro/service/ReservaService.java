package br.com.fundatec.carro.service;

import br.com.fundatec.carro.model.Carro;
import br.com.fundatec.carro.model.Reserva;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class ReservaService {
    public Reserva incluir(Reserva reserva, Long id){
        validar(reserva);
        return reservaRepository.save(reserva);
    }
    private void validar(Reserva reserva) {
        if (reserva.getDataFim().isBefore(reserva.getDataInicio())) {
            throw new RuntimeException("Data de Inicio não pode " + " ser maior que data fim.");
        }
    }
    public Reserva consultar(Long id) {

        return reservaRepository.findById(idCarro).orElse(null);
    }
}
