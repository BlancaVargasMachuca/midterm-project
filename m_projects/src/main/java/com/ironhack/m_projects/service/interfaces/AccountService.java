package com.ironhack.m_projects.service.interfaces;

import com.ironhack.m_projects.model.account.Account;
import com.ironhack.m_projects.model.account.CheckingAccount;


import java.math.BigDecimal;
import java.util.List;

public interface AccountService {

    List<Account> findAllAccounts();

    String getAccountBalance(String accountNumber);

    Account createCheckingAccount(String entityNumber, String branchNumber, BigDecimal amount, Long primaryOwnerId, Long secondaryOwnerId, String secretKey);

    Account createSavingAccount(String entityNumber, String branchNumber, BigDecimal amount, Long primaryOwnerId, Long secondaryOwnerId,
                                String secretKey, BigDecimal minimumBalance, Float interestRate);

    Account createCreditCardAccount(String entityNumber, String branchNumber, BigDecimal amount, Long primaryOwnerId, Long secondaryOwnerId,
                                    BigDecimal credit_limit, Float interestRate);

    void updateBalance(String accountNumber, BigDecimal amount);

    void applyInterestRate(List<Account> accountList);

    void applyMonthlyMaintenanceFee(List<Account> accountList);

    void updateStatus(String accountNumber);

    List<CheckingAccount> findAllCheckingAccount();
}
