package com.ironhack.m_projects.controller;


import com.ironhack.m_projects.model.account.Account;
import com.ironhack.m_projects.model.account.CheckingAccount;
import com.ironhack.m_projects.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/Account")

public class AccountController {

    @Autowired
    private AccountService accountService;
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/accounts")
    public List<Account> accounts() {

        return accountService.findAllAccounts();
    }

    @GetMapping("/accounts/checkings")
    @ResponseStatus(HttpStatus.OK)
    public List<CheckingAccount> accountsCheckings() {
        return accountService.findAllCheckingAccount();
    }
}

