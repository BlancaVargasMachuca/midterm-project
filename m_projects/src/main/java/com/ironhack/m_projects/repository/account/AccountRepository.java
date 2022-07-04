package com.ironhack.m_projects.repository.account;

import com.ironhack.m_projects.model.account.Account;

import java.util.List;
import java.util.Optional;

public interface AccountRepository {
    List<Account> findByPrimaryOwnerIdOrSecondaryOwnerId(Long id, Long id1);

    Optional<Account> findByAccountNumber(String accountNumber);

    void save(Account account);
}
