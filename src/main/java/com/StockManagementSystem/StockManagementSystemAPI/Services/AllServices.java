package com.StockManagementSystem.StockManagementSystemAPI.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StockManagementSystem.StockManagementSystemAPI.Repo.AdminDetailsActivity;
import com.StockManagementSystem.StockManagementSystemAPI.Repo.UserDetailsActivity;
import com.StockManagementSystem.StockManagementSystemAPI.Tables.AdminDetails;
import com.StockManagementSystem.StockManagementSystemAPI.Tables.UserDetails;

@Service
public class AllServices implements ServiceInterface{

	@Autowired
	UserDetailsActivity userDetails;
	
	@Autowired
	AdminDetailsActivity adminDetails;
	
	
	// Store User Details
	
	@Override
	public String storeUserDetails(UserDetails user) 
	{	
		try 
		{
			if(userDetails.findByEmailid(user.getEmailid())==null)
			{
				userDetails.save(user);
				userDetails.flush();
				return "User Details are Added !";
			}
			else 
			{
				return "User Details Are Already Available !";
			}
		}
		catch(Exception e)
		{
			return "User Details Are Already Available !";
		}
		
	}

	
	// Login Validation
	
	@Override
	public String LoginValidation(AdminDetails admin) {
		
		try 
		{
			if(adminDetails.findByUsernameAndPassword(admin.getUsername(),admin.getPassword())==null)
			{
				return "Invalid User";
			}
			else 
			{
				return "Valid User";
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			return "Invalid User";
		}
	}

}
