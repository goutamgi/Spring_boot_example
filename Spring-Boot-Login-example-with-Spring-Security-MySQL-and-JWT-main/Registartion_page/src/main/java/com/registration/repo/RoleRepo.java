package com.registration.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registration.model.ERole;
import com.registration.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
	
	 Optional<Role> findByName(ERole name);

}
