package com.bank.accountbank.repository;

import com.bank.accountbank.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
