package com.ironhack.m_projects.model.user;

import com.ironhack.m_projects.utils.Address;

import com.ironhack.m_projects.enums.Role;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "account_holder")
public class AccountHolder extends User{



    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "street")),
            @AttributeOverride(name = "city", column = @Column(name = "city")),
            @AttributeOverride(name = "country", column = @Column(name = "country")),
            @AttributeOverride(name = "postalCode", column = @Column(name = "postal_code"))
    })
    private Address address;

    @Column(name = "mailing_address")
    private String mailingAddress;

    public AccountHolder() {
    }

    public AccountHolder(String username, String password, Role role, LocalDate dateOfBirth, Address address,
                         String mailingAddress) {
        super(username, password, role);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.mailingAddress = mailingAddress;
    }


    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}
