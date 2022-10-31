package org.ncu.hirewheels.repository;



import org.ncu.hirewheels.entity.Vehicle_subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleSubCategoryRepository extends JpaRepository<Vehicle_subcategory, Long> {
//	public Vehicle_subcategory findByVehicle_subcategory_id(Long vehicle_subcategory_id);
	Vehicle_subcategory findOneByvehicleSubcategoryId(Long vehicle_subcategory_id);
}