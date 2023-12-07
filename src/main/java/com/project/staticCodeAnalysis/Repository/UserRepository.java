package com.project.staticCodeAnalysis.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.staticCodeAnalysis.model.UserDocument;

public interface UserRepository extends MongoRepository<UserDocument, String> {
	
	 UserDocument findByUsername(String username);

}
