package com.ironhack.m_projects.validations;

import com.ironhack.m_projects.model.user.AccountHolder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.StringTokenizer;

@Component
public class DataValidation {

    /**
     * method to validate a correct name
     *
     * @param name Should "firstName lastName"
     */
    public static boolean validateName(String name) {
        name = name.trim();
        StringTokenizer words = new StringTokenizer(name);
        return words.countTokens() < 2;
    }

    /**
     * method to validate a correct amount
     *
     * @param amount Should be more than 0
     */
    public static boolean validateAmount(BigDecimal amount) {
        return amount.signum() <= 0;
    }

    /**
     * method to validate if the PrimaryOwner is less than 24
     *
     * @param accountHolder
     */
    public static boolean validateAgeOfPrimaryOwner(AccountHolder accountHolder) {
        LocalDate dateForStudentAccount = LocalDate.now().minusYears(24L);
        return accountHolder.getDateOfBirth().compareTo(dateForStudentAccount) >= 0;
    }

}
