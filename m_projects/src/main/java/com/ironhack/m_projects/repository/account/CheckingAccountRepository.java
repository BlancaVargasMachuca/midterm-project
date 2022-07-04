package com.ironhack.m_projects.repository.account;

import com.ironhack.m_projects.model.account.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, Long> {

    Optional<CheckingAccount> findById(Long id);

    @Query(value = "SELECT c.id from checking_account c where c.account_id = :id", nativeQuery = true)
    List<Object[]> findByAccountId(@Param("id") Long id);

    List<CheckingAccount> findByPrimaryOwnerId(Long id);

    List<CheckingAccount> findAll();
}
