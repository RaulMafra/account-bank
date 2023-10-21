package com.bank.accountbank.service;

import com.bank.accountbank.model.User;

public interface UserService {

        User findById(Long id);

        User create(User user);

}
