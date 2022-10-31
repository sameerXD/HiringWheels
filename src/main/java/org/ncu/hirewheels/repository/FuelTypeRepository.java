package org.ncu.hirewheels.repository;



import org.ncu.hirewheels.entity.Fuel_type;
import org.ncu.hirewheels.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelTypeRepository extends JpaRepository<Fuel_type, Long> {
	
	
}