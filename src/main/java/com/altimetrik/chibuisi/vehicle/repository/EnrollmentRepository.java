package com.altimetrik.chibuisi.vehicle.repository;

import com.altimetrik.chibuisi.vehicle.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    Enrollment findByVin(String vin);
}
