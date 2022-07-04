package com.ironhack.m_projects.service.impl;

import com.ironhack.m_projects.model.account.Account;
import com.ironhack.m_projects.repository.account.AccountRepository;

import com.ironhack.m_projects.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> findAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public String getAccountBalance(String accountNumber) {
        return null;
    }

    @Override
    public Account createCheckingAccount(String entityNumber, String branchNumber, BigDecimal amount, Long primaryOwnerId, Long secondaryOwnerId, String secretKey) {
        return null;
    }

    @Override
    public Account createSavingAccount(String entityNumber, String branchNumber, BigDecimal amount, Long primaryOwnerId, Long secondaryOwnerId, String secretKey, BigDecimal minimumBalance, Float interestRate) {
        return null;
    }

    @Override
    public Account createCreditCardAccount(String entityNumber, String branchNumber, BigDecimal amount, Long primaryOwnerId, Long secondaryOwnerId, BigDecimal credit_limit, Float interestRate) {
        return null;
    }

    @Override
    public void updateBalance(String accountNumber, BigDecimal amount) {

    }

    @Override
    public void applyInterestRate(List<Account> accountList) {

    }

    @Override
    public void applyMonthlyMaintenanceFee(List<Account> accountList) {

    }

    @Override
    public void updateStatus(String accountNumber) {

    }
}
