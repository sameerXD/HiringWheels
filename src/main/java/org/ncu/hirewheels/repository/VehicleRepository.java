package org.ncu.hirewheels.repository;



import org.ncu.hirewheels.entity.Vehicle;
import org.ncu.hirewheels.entity.Vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
	Vehicle findOneByVehicleId(Long vehicleId);

	
}