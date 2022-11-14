package com.fortun.backend.application.account.repository;

import com.fortun.backend.application.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
