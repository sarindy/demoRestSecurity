package com.sarindy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sarindy.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
	
	public Role findByRole(String role);

}
