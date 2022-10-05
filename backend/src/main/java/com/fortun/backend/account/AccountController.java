package com.fortun.backend.account;

import com.fortun.backend.openapi.api.AccountsApi;
import com.fortun.backend.openapi.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class AccountController implements AccountsApi {

    private final static Logger LOGGER = Logger.getLogger(AccountController.class.getSimpleName());

    @GetMapping("/")
    @Override
    public ResponseEntity<List<Account>> getAccounts() {
        var accList = Collections.singletonList(new Account().birthday("s").capital(234));
        var response = new ResponseEntity(Collections.singletonList(accList), HttpStatus.OK);
        LOGGER.log(Level.INFO, String.format("The response of accountsGet is %s", Objects.requireNonNull(response.getBody())));
        return response;
    }
}
