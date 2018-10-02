package com.sgic.leavemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavemanagement.entity.User;

public interface UserRepository extends JpaRepository<User , Long> {

}
