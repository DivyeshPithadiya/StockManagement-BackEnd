package com.StockManagementSystem.StockManagementSystemAPI.Services;

import com.StockManagementSystem.StockManagementSystemAPI.Tables.AdminDetails;
import com.StockManagementSystem.StockManagementSystemAPI.Tables.UserDetails;

public interface ServiceInterface {
	
	public String storeUserDetails(UserDetails user);
	
	public String LoginValidation(AdminDetails admin);

}
