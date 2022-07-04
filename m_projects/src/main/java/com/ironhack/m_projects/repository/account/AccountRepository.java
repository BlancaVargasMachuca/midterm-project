package com.ironhack.m_projects.repository.account;

import com.ironhack.m_projects.model.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountRepository extends JpaRepository <Account, Long> {
    List<Account> findByPrimaryOwnerIdOrSecondaryOwnerId(Long id, Long id1);

    Optional<Account> findByAccountNumber(String accountNumber);

}
