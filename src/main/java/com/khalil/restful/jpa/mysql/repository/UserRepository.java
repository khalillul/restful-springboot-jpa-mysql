package com.khalil.restful.jpa.mysql.repository;

import com.khalil.restful.jpa.mysql.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByFirstName (String firstName);
    List<User> findByEmail(String email);
}
