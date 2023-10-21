package com.bank.accountbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.accountbank.model.User;

public interface  UserRepository extends JpaRepository<User, Long>{

}
