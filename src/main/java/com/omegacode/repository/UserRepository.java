package com.omegacode.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.omegacode.entity.User;

public interface UserRepository extends CrudRepository<User, BigInteger>{
		
	User getUserByConfirmationId(String confirmationId);
	User getUserByUsername(String username);
	
}
