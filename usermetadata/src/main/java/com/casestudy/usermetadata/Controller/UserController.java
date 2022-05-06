//handle all request from the frontend
package com.casestudy.usermetadata.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.casestudy.usermetadata.Entity.UserMetaData;
import com.casestudy.usermetadata.Services.UserService;

@RestController
@RequestMapping("/offerzone/users/")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;
    
//  postEndPoint we can take data from frontend and from post mechanism we can save data in backend server 
	@PostMapping("saveUserDetails")
	public UserMetaData saveUserDetail(@RequestBody UserMetaData userData) {
		UserMetaData user= userService.saveUserMetaDataTODB(userData);
		return user;
	}
	
	@PutMapping("/search/{userId}")
	public UserMetaData updateUser() {
		return userService.getUserDetailsFromDB(toString());		 
	}
	
//  getEndPoint is used to fetch data from backend to frontend
    @GetMapping("getUserDetails/{name}")
	public UserMetaData getUserDetails(@PathVariable String name) {
		UserMetaData user=userService.getUserDetailsFromDB(name);
		return user;
	}
	

}
