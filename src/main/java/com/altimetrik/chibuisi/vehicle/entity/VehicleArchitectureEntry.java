package com.altimetrik.chibuisi.vehicle.entity;

import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class VehicleArchitectureEntry {
    private List<String> ivcErrors;
    private List<String> ivcSuccessfulVins;
    private List<String> ivcFailureVins;
}
