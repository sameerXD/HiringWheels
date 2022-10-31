package org.ncu.hirewheels.repository;



import org.ncu.hirewheels.entity.Vehicle_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleCategoryRepository extends JpaRepository<Vehicle_category, Long> {
//	public Vehicle_category findByVehicle_category_id(Long vehicle_category_id);
	Vehicle_category findOneByVehicleCategoryId(Long vehicleCategoryId);
	
}