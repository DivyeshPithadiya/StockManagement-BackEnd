package com.StockManagementSystem.StockManagementSystemAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StockManagementSystem.StockManagementSystemAPI.Tables.UserDetails;

@Repository
public interface UserDetailsActivity extends JpaRepository<UserDetails, Long>{
	
	
	UserDetails findByEmailid(String email);

	
}
