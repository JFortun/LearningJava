package com.fortun.backend.account.service.impl;

import com.fortun.backend.account.mapper.AccountMapper;
import com.fortun.backend.account.model.Account;
import com.fortun.backend.account.repository.AccountRepository;
import com.fortun.backend.account.service.AccountService;
import com.fortun.backend.openapi.model.CreateAccountIDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

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
