package com.fortun.backend.account.controller;

import com.fortun.backend.account.service.AccountService;
import com.fortun.backend.openapi.api.AccountsApi;
import com.fortun.backend.openapi.model.AccountODTO;
import com.fortun.backend.openapi.model.CreateAccountIDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class AccountController implements AccountsApi {

    private final AccountService accountService;

    public AccountController(final AccountService accountService) {
        this.accountService = accountService;
    }

    private final static Logger LOGGER = Logger.getLogger(AccountController.class.getSimpleName());

    @Override
    public ResponseEntity<List<AccountODTO>> getAllAccounts() {
        var response = new ResponseEntity(Collections.singletonList(accountService.getAllAccounts()), HttpStatus.OK);
        LOGGER.log(Level.INFO, String.format("The response of accountsGet is %s", Objects.requireNonNull(response.getBody())));
        return response;
    }

    @Override
    public ResponseEntity<AccountODTO> createAccount(CreateAccountIDTO createAccountIDTO) {
        var accountModel = accountService.createAccount(createAccountIDTO);
        var response = new ResponseEntity(accountModel, HttpStatus.OK);
        LOGGER.log(Level.INFO, String.format("The response of createAccount is %s", Objects.requireNonNull(response.getBody())));
        return response;
    }
}
