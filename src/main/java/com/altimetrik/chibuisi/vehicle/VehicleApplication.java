package com.altimetrik.chibuisi.vehicle;

import com.altimetrik.chibuisi.vehicle.entity.VehicleArchitectureEntry;
import com.altimetrik.chibuisi.vehicle.entity.VehicleArchitectureResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VehicleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(VehicleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        List<String> ivcSuccessfulVins = Arrays.asList("vin100", "vin101", "vin102");
//        VehicleArchitectureEntry entry = VehicleArchitectureEntry.builder().ivcSuccessfulVins(ivcSuccessfulVins).build();
//        VehicleArchitectureResponse response = VehicleArchitectureResponse.builder()
//                .vehicleArchitectureEntries(Arrays.asList(entry)).build();
//
//        System.out.println(response);
    }
}
