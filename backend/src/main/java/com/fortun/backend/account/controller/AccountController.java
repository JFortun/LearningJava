package com.fortun.backend.account.controller;

import com.fortun.backend.account.service.AccountService;
import com.fortun.backend.openapi.api.AccountsApi;
import com.fortun.backend.openapi.model.AccountODTO;
import com.fortun.backend.openapi.model.CreateAccountIDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class AccountController implements AccountsApi {

    @Autowired
    AccountService accountService;

    private final static Logger LOGGER = Logger.getLogger(AccountController.class.getSimpleName());

    @GetMapping("/account/all")
    @Override
    public ResponseEntity<List<AccountODTO>> getAllAccounts() {
        var response = new ResponseEntity(Collections.singletonList(accountService.getAllAccounts()), HttpStatus.OK);
        LOGGER.log(Level.INFO, String.format("The response of accountsGet is %s", Objects.requireNonNull(response.getBody())));
        return response;
    }

    @PostMapping("/account/create")
    @Override
    public ResponseEntity<AccountODTO> createAccount(CreateAccountIDTO createAccountIDTO) {
        var accountModel = accountService.createAccount(createAccountIDTO);
        var response = new ResponseEntity(accountModel, HttpStatus.OK);
        LOGGER.log(Level.INFO, String.format("The response of createAccount is %s", Objects.requireNonNull(response.getBody())));
        return response;
    }
}