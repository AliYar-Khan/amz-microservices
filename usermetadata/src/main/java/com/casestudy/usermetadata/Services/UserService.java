//responsible for controlling business logic of the API
package com.casestudy.usermetadata.Services;

import java.util.ArrayList;

import org.springframework.data.domain.Sort;

import com.casestudy.usermetadata.Entity.UserMetaData;

public interface UserService {

	UserMetaData saveUserMetaDataTODB(UserMetaData userData);
	
	ArrayList<UserMetaData> findAllByuniqueId(long id);

	UserMetaData findByUsername(Sort name);

	UserMetaData getUserDetailsFromDB(String name);


}
