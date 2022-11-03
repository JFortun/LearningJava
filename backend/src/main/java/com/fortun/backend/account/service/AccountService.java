package com.fortun.backend.account.service;

import com.fortun.backend.account.model.AccountModel;
import com.fortun.backend.openapi.model.CreateAccountIDTO;

import java.util.List;

public interface AccountService {

    List<AccountModel> getAllAccounts();

    AccountModel createAccount(CreateAccountIDTO accountIDTO);
}
