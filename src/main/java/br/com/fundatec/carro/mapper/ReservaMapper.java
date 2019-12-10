package br.com.fundatec.carro.mapper;

import br.com.fundatec.carro.api.dto.CarroOutputDto;
import br.com.fundatec.carro.api.dto.ReservaOutputDto;
import br.com.fundatec.carro.model.Carro;

public class ReservaMapper{
    public ReservaOutputDto mapear (Reserva reserva){
        ReservaOutputDto reservaOutputDto = new ReservaOutputDto();
        reservaOutputDto.setId(reserva.getId());
        reservaOutputDto.setNome(reserva.getNome());
        reservaOutputDto.setDataInicio(reserva.getDataInicio());
        reservaOutputDto.setDataFim(reserva.getDataFim());
        return reservaOutputDto;
    }

    public Reserva mapear(ReservaInputDto reservaInputDto){
    Reserva reserva = new Reserva();
    reserva.setNome(reservaInputDTO);
    reserva.setDataInicio(reservaInputDto);
    reserva.setDataFim(reservaInputDto);
    return reserva;
    }
}
