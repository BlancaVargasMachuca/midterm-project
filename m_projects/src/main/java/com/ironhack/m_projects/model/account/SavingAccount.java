package com.ironhack.m_projects.model.account;

import com.ironhack.m_projects.enums.AccountType;
import com.ironhack.m_projects.enums.Status;
import com.ironhack.m_projects.model.user.AccountHolder;
import com.ironhack.m_projects.model.user.User;
import com.ironhack.m_projects.utils.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "saving_account")
public class SavingAccount extends Account {
    @Column(name = "secret_key", nullable = false)
    private String secretKey;
    @Column(name = "minimum_balance")
    private BigDecimal minimumBalance;
    @Column(name = "creation_date")
    private LocalDate creationDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "interest_rate")
    private Float interestRate;

    @Column(name = "last_interest_rate_date")
    private LocalDate lastInterestRateDate;

    public SavingAccount() {
    }

    public SavingAccount(String secretKey, BigDecimal minimumBalance, LocalDate creationDate, Status status,
                         Float interestRate, LocalDate lastInterestRateDate) {
        this.secretKey = secretKey;
        this.minimumBalance = minimumBalance;
        this.creationDate = creationDate;
        this.status = status;
        this.interestRate = interestRate;
        this.lastInterestRateDate = lastInterestRateDate;
    }

    public SavingAccount(String entityNumber, String branchNumber, String accountNumber, Money balance, User primaryOwner, User secondaryOwner, AccountType accountType, String secretKey, BigDecimal minimumBalance, LocalDate creationDate, Status status, Float interestRate, LocalDate lastInterestRateDate) {
        super(entityNumber, branchNumber, accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.secretKey = secretKey;
        this.minimumBalance = minimumBalance;
        this.creationDate = creationDate;
        this.status = status;
        this.interestRate = interestRate;
        this.lastInterestRateDate = lastInterestRateDate;
    }

    public SavingAccount(String accountNumber, Money balance, User primaryOwner, User secondaryOwner, AccountType accountType, String secretKey, BigDecimal minimumBalance, LocalDate creationDate, Status status, Float interestRate, LocalDate lastInterestRateDate) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.secretKey = secretKey;
        this.minimumBalance = minimumBalance;
        this.creationDate = creationDate;
        this.status = status;
        this.interestRate = interestRate;
        this.lastInterestRateDate = lastInterestRateDate;
    }

    public SavingAccount(String entityNumber, String branchNumber, Money balance, AccountHolder accountHolder, Object o, String secretKey, LocalDate now, Status active, AccountType saving, LocalDate now1) {
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
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

    public Float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Float interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getLastInterestRateDate() {
        return lastInterestRateDate;
    }

    public void setLastInterestRateDate(LocalDate lastInterestRateDate) {
        this.lastInterestRateDate = lastInterestRateDate;
    }
}