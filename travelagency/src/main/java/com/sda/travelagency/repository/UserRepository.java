package com.sda.travelagency.repository;

import com.sda.travelagency.entity.UserModel;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository {

private UserRepository userRepository;

    public static Optional<UserModel> findById(String username) {
        return findById(username);
    }

    public UserModel save(UserModel newUser) {
        return newUser;
    }

}
