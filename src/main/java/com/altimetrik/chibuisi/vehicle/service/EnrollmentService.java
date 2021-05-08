package com.altimetrik.chibuisi.vehicle.service;

import com.altimetrik.chibuisi.vehicle.entity.Enrollment;
import com.altimetrik.chibuisi.vehicle.entity.VehicleArchitectureEntry;
import com.altimetrik.chibuisi.vehicle.entity.VehicleArchitectureRequest;
import com.altimetrik.chibuisi.vehicle.entity.VehicleArchitectureResponse;
import com.altimetrik.chibuisi.vehicle.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EnrollmentService {
    @Autowired
    private EnrollmentRepository enrollmentRepository;

    public VehicleArchitectureResponse saveVehicleArchitecture(VehicleArchitectureRequest vehicleArchitectureRequest){

        List<String> vinsWithUnknownArch = new ArrayList<>();
        for (String vin : vehicleArchitectureRequest.getVins()) {
            vinsWithUnknownArch.addAll(getVehicleArchitecture(vin).getVehicleArchitectureEntries().get(0).getIvcFailureVins());
        }
        VehicleArchitectureResponse response = VehicleArchitectureResponse.builder().build();
        List<String> ivcSuccessfulVins = new ArrayList<>();
        for (String vin : vinsWithUnknownArch) {
            ivcSuccessfulVins.add(enrollmentRepository.save(Enrollment.builder().id(1L).vin(vin).build()).getVin());
        }
        VehicleArchitectureEntry entry = VehicleArchitectureEntry.builder().ivcSuccessfulVins(ivcSuccessfulVins).ivcErrors(new ArrayList<>()).build();
        response.setVehicleArchitectureEntries(Arrays.asList(entry));
        return response;
    }

    public VehicleArchitectureResponse getVehicleArchitecture(String vin){
        List<String> ivcErrors = new ArrayList<>();
        List<String> ivcFailureVins = Arrays.asList(vin);
        List<String> ivcSuccessfulVins = Arrays.asList()
;       VehicleArchitectureEntry entry = VehicleArchitectureEntry.builder()
                .ivcFailureVins(ivcFailureVins).ivcSuccessfulVins(ivcSuccessfulVins).ivcErrors(ivcErrors).build();
        return VehicleArchitectureResponse.builder().vehicleArchitectureEntries(Arrays.asList(entry)).build();
    }
}
