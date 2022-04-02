package com.examplergistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class UserService {
@Autowired 
private UserRepository repository; 

public List<User> listAll() {
    return repository.findAll();
}
}
