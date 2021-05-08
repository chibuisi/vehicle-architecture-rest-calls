package com.altimetrik.chibuisi.vehicle.entity;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VehicleArchitectureRequest {
    private List<String> vins;
}
