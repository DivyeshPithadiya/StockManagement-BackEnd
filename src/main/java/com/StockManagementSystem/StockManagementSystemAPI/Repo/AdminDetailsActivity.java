package com.StockManagementSystem.StockManagementSystemAPI.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.StockManagementSystem.StockManagementSystemAPI.Tables.AdminDetails;
@Repository
public interface AdminDetailsActivity extends JpaRepository<AdminDetails, Integer>{
	
	AdminDetails findByUsernameAndPassword(String name,String Password);

}
