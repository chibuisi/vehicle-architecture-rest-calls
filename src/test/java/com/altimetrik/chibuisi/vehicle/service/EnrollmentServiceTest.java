package com.altimetrik.chibuisi.vehicle.service;

import com.altimetrik.chibuisi.vehicle.entity.Enrollment;
import com.altimetrik.chibuisi.vehicle.entity.VehicleArchitectureRequest;
import com.altimetrik.chibuisi.vehicle.repository.EnrollmentRepository;
import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnrollmentServiceTest {
    @InjectMocks
    private EnrollmentService enrollmentService;

    @Mock
    private EnrollmentRepository enrollmentRepository;

    @Mock
    private Enrollment enrollment;

    @Test
    public void saveVehicleArchitecture(){
        Mockito.when(enrollmentRepository.save(Mockito.any())).thenReturn(enrollment);
        VehicleArchitectureRequest request = VehicleArchitectureRequest.builder().vins(List.of("vin101")).build();
        Assertions.assertTrue(enrollmentService.saveVehicleArchitecture(request)
                .getVehicleArchitectureEntries().get(0).getIvcErrors().isEmpty());
    }
}
