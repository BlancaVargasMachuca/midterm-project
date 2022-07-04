package com.ironhack.m_projects.repository.user;

import com.ironhack.m_projects.model.user.AccountHolder;

import java.util.Optional;

public interface AccountHolderRepository {
    Optional<AccountHolder> findById(Long primaryOwnerId);
}
