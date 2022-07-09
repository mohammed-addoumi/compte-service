package com.example.compteservice.web;

import com.example.compteservice.entities.Account;
import com.example.compteservice.repositories.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("account-api/v1")
@AllArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
}
