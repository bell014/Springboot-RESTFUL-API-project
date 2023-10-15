package com.Neder.RESTFULLAPIPROJECT.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Neder.RESTFULLAPIPROJECT.entity.*;

public interface UserRepository extends JpaRepository<User, Long> {

}