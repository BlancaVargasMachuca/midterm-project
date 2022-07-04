package com.ironhack.m_projects.controller;


import com.ironhack.m_projects.model.account.Account;
import com.ironhack.m_projects.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class AccountController {

    @Autowired
    private AccountService accountService;
    @GetMapping(value = "/accounts")
    public List<Account> accounts() {

        return accountService.findAllAccounts();
    }
}

