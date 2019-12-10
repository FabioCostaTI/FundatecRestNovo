package br.com.fundatec.carro.api;

import br.com.fundatec.carro.api.dto.ReservaInputDto;
import br.com.fundatec.carro.model.Reserva;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ReservaApi {
    @PostMapping("/carros/{id}/reservas")
    public ResponseEntity<?> incluirReserva(@Valid @RequestBody ReservaInputDto reservaInputDto){
        Reserva reserva = reservaMapper.mapear(ReservaInputDto);
        try{
            reserva = reservaService.incluir(reserva);


    }
}
