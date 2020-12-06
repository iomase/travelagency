package com.sda.travelagency.repository;

import com.sda.travelagency.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<UserModel, String> {

}
