package com.fortun.backend.account.service;

import com.fortun.backend.account.model.Account;
import com.fortun.backend.openapi.model.CreateAccountIDTO;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccounts();

    Account createAccount(CreateAccountIDTO accountIDTO);
}
