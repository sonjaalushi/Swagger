package com.example.springswagger.service;

import com.example.springswagger.model.User;
import com.example.springswagger.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Transactional
    public String saveUser(User user) {
        userRepository.save(user);
        return "User saved with id" + user.getId();

    }
    @Transactional(readOnly = true)
    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }
    @Transactional
    public List<User> deleteUser(Long userId) {
        userRepository.deleteById(userId);
        return userRepository.findAll();
    }
}
