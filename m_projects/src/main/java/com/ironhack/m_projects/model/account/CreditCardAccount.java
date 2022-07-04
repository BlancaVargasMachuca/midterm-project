package com.ironhack.m_projects.model.account;

import com.ironhack.m_projects.enums.AccountType;
import com.ironhack.m_projects.model.user.AccountHolder;
import com.ironhack.m_projects.model.user.User;
import com.ironhack.m_projects.utils.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "account_id")
@Table(name = "credit_card_account")
public class CreditCardAccount extends Account {

    @Column(name = "credit_limit")
    private BigDecimal creditLimit;
    @Column(name = "interest_rate")
    private Float interestRate;

    @Column(name = "last_interest_rate_date")
    private LocalDate lastInterestRateDate;

    public CreditCardAccount(BigDecimal creditLimit, Float interestRate, LocalDate lastInterestRateDate) {
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.lastInterestRateDate = lastInterestRateDate;
    }

    public CreditCardAccount(String entityNumber, String branchNumber, String accountNumber, Money balance, User primaryOwner, User secondaryOwner, AccountType accountType, BigDecimal creditLimit, Float interestRate, LocalDate lastInterestRateDate) {
        super(entityNumber, branchNumber, accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.lastInterestRateDate = lastInterestRateDate;
    }

    public CreditCardAccount(String accountNumber, Money balance, User primaryOwner, User secondaryOwner,
                             AccountType accountType, BigDecimal creditLimit, Float interestRate, LocalDate lastInterestRateDate) {
        super(accountNumber, balance, primaryOwner, secondaryOwner, accountType);
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.lastInterestRateDate = lastInterestRateDate;
    }

    public CreditCardAccount(String entityNumber, String branchNumber, Money balance, AccountHolder accountHolder, Object o, AccountType creditCard, LocalDate now) {
    }

    public CreditCardAccount() {

    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
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
