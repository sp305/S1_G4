package com.example.AgenciaTurismo.dto.request;

import com.example.AgenciaTurismo.dto.response.FlightReservationResDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FlightReservationReqDto {
    private String userName;
    private FlightReservationResDto flightReservation;
    private PaymentMethodDto paymentMethodDto;

}