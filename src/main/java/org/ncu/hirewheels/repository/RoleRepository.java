package org.ncu.hirewheels.repository;



import org.ncu.hirewheels.entity.Role;
import org.ncu.hirewheels.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	
}