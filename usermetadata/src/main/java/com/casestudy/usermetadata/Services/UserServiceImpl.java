package com.casestudy.usermetadata.Services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.casestudy.usermetadata.Entity.UserMetaData;
import com.casestudy.usermetadata.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepo userRepo;
	
	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;
	
//  submit the data into the database
	@Override
	public UserMetaData saveUserMetaDataTODB(UserMetaData userData) {
		return userRepo.save(userData);
	}

//  Retrieve the data from the database
    @Override
    public ArrayList<UserMetaData> findAllByuniqueId(long id) {
    	return (ArrayList<UserMetaData>) userRepo.findAll();
    }

//  search by name
    public UserMetaData findByUsername(Sort name) {
	    return (UserMetaData) userRepo.findAll(name);
}

	public UserMetaData getUserDetailsFromDB(String name) {
	    return (UserMetaData) userRepo.findAll();
	}

//UserMetaData findByUsername(String name);
//   public UserMetaData findByUsername(String name) {
//	   returnUserMetaData) userRepo.findById(name);
//   }

 //UserMetaData findByUseremail(String email);
//    public UserMetaData findByUserEmail(String email) {
//    	return   userRepo.find
//    }
}