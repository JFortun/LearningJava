package com.fortun.backend.application.account.service;

import com.fortun.backend.application.account.model.Account;
import com.fortun.backend.openapi.model.CreateAccountIDTO;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();

    Account createAccount(CreateAccountIDTO accountIDTO);
}
