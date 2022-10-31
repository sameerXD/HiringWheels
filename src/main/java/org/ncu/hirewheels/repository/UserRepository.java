package org.ncu.hirewheels.repository;



import org.ncu.hirewheels.entity.Booking;
import org.ncu.hirewheels.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	User findByMobileNumber(String mobileNumber);

	
}