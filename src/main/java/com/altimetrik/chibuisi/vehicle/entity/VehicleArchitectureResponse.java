package com.altimetrik.chibuisi.vehicle.entity;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VehicleArchitectureResponse {
    private List<VehicleArchitectureEntry> vehicleArchitectureEntries;
}
