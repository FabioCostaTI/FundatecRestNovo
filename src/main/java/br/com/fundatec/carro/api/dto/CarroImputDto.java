package br.com.fundatec.carro.api.dto;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public class CarroImputDto {
    @NotBlank(message = "campo é obrigatório")
    private String nome;
    @Pattern(regexp = "^[A-Z]{3}[0-9]{4}$", message = "placa invalida")
    @NotBlank(message = "campo é obrigatório")
    private String placa;
    @Past(message = "erro na data")
    @NotNull(message = "o campo esta vazio")
    private LocalDate dataFabricacao;
    @NotNull(message = "o campo esta vazio")
    private LocalDate dataModelo;
    @NotEmpty (message = "o campo não pode ser vazio")
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataModelo() {
        return dataModelo;
    }

    public void setDataModelo(LocalDate dataModelo) {
        this.dataModelo = dataModelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
