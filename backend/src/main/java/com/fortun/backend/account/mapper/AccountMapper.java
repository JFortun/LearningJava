package com.fortun.backend.account.mapper;

import com.fortun.backend.account.model.Account;
import com.fortun.backend.account.model.Role;
import com.fortun.backend.openapi.model.CreateAccountIDTO;
import com.fortun.backend.openapi.model.RoleDTO;

import java.util.UUID;

public class AccountMapper {

    public static Account transformCreateAccountIDTOToAccountModel(CreateAccountIDTO createAccountIDTO) {
        var accountModel = new Account();
        accountModel.setId(UUID.randomUUID());
        accountModel.setRole(transformApiRoleToModelRole(createAccountIDTO.getRole()));
        accountModel.setEmail(createAccountIDTO.getEmail());
        accountModel.setName(createAccountIDTO.getName());
        accountModel.setPassword(createAccountIDTO.getPassword());
        accountModel.setBirthday(createAccountIDTO.getBirthday());
        accountModel.setCapital(createAccountIDTO.getCapital());
        return accountModel;
    }

    public static Role transformApiRoleToModelRole(RoleDTO role) {
        return Role.valueOf(role.name());
    }
}
