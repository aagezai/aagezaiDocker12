package com.aagezaidockerg12.aagezaidockera12.service;

import com.aagezaidockerg12.aagezaidockera12.model.UserEntity;
import com.aagezaidockerg12.aagezaidockera12.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserEntity> getUserById(Integer userId) {
        return userRepository.findById(userId);
    }

    public void addUser(UserEntity user) {
        userRepository.save(user);
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}
