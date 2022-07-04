package com.ironhack.m_projects.model.account;

import com.ironhack.m_projects.enums.AccountType;
import com.ironhack.m_projects.enums.Status;
import com.ironhack.m_projects.model.user.AccountHolder;
import com.ironhack.m_projects.model.user.User;
import com.ironhack.m_projects.utils.Money;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "student_checking_account")
public class StudentAccount extends Account{
    @Column(name = "secret_key", nullable = false)
    @NotEmpty(message = "Secret Key is necessary")
    private String secretKey;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    public StudentAccount() {
    }

    public StudentAccount(String accountNumber, Money balance, User primaryOwner, User secondaryOwner,
                          AccountType accountType, String secretKey, LocalDate creationDate, Status status) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.secretKey = secretKey;
        this.creationDate = creationDate;
        this.status = status;
    }

    public StudentAccount(String entityNumber, String branchNumber, Money balance, AccountHolder accountHolder, AccountHolder accountHolder1, String secretKey, LocalDate now, Status active, AccountType studentChecking) {
    }


    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}