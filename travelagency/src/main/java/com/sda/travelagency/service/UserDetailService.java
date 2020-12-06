package com.sda.travelagency.service;

import com.sda.travelagency.dto.UserDTO;
import com.sda.travelagency.entity.UserModel;
import com.sda.travelagency.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service("userService")
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bcryptEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserModel> userCredentialModelOptional = userRepository.findById(username);
        if (!userCredentialModelOptional.isPresent()) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }

        UserModel userCredentialModel = userCredentialModelOptional.get();
        String userName = userCredentialModel.getUsername();
        String password = userCredentialModel.getPassword();
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        //ROLE_ADMIN is important to be picked up by hasRole from @PreAuthorize in DummyController
        SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority
                ("ROLE_" + userCredentialModel.getRole().toUpperCase());
        authorities.add(simpleGrantedAuthority);
        return new User(userName, password, authorities);
    }

    public UserModel register(UserDTO user) {
        UserModel newUser = new UserModel();
        newUser.setUsername(user.getUserName());
        newUser.setRole("USER");
        newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
        return userRepository.save(newUser);
    }

}
