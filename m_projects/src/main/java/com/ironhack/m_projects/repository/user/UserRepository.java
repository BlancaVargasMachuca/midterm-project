package com.ironhack.m_projects.repository.user;

import com.ironhack.m_projects.model.user.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findByUsername(Object username);
}
