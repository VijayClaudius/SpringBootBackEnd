package com.login.jwt.dao;

import com.login.jwt.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, String> {


    @Query("SELECT u.userName, u.userFirstName, u.userLastName FROM User u")
    Object[] findUserDetailsById();

}
