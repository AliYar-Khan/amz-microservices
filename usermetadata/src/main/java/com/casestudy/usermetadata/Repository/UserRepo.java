//responsible for connecting to the database
package com.casestudy.usermetadata.Repository;

import java.math.BigInteger;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.casestudy.usermetadata.Entity.UserMetaData;

@EnableMongoRepositories
public interface UserRepo extends MongoRepository<UserMetaData, BigInteger> {
	
//	@Query("{'$and':[ {'email':email}, {'password':pass} ] }")
    UserMetaData findByEmailAndPassword(String email, String password);
}
