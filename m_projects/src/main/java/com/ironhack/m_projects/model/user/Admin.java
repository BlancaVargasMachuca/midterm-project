package com.ironhack.m_projects.model.user;

import com.ironhack.m_projects.enums.Role;
import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "admin")
public class Admin extends User{


    public Admin(String username, String password, Role role) {
        super(username, password, role);

    }

    public Admin() {

    }
}
