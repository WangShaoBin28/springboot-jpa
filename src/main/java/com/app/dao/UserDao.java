package com.app.dao;

import com.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {


    @Query("select u from User u where u.id = ?1")
    User selectUserById(Integer id);

    @Query("select u from User u")
    List<User> selectUsers();


}
