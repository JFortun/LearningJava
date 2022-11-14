package com.fortun.backend.application.account.service.impl;

import com.fortun.backend.application.account.mapper.AccountMapper;
import com.fortun.backend.application.account.model.Account;
import com.fortun.backend.application.account.repository.AccountRepository;
import com.fortun.backend.application.account.service.AccountService;
import com.fortun.backend.openapi.model.CreateAccountIDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(final AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account createAccount(CreateAccountIDTO createAccountIDTO) {
        var accountModel = AccountMapper.transformCreateAccountIDTOToAccountModel(createAccountIDTO);
        return accountRepository.save(accountModel);
    }
}
