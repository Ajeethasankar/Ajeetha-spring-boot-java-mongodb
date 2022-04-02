package com.registerForm.userrepo;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.registerForm.model.User;






public interface UserRepo extends MongoRepository<User, String> {

}
