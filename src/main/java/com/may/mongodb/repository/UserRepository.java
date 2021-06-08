package com.may.mongodb.repository;

import com.may.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository  extends MongoRepository<User, String> {



}
