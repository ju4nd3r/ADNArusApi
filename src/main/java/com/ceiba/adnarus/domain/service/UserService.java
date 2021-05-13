package com.ceiba.adnarus.domain.service;

import com.ceiba.adnarus.domain.User;
import com.ceiba.adnarus.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user){
        return  userRepository.save(user);
    }
}
