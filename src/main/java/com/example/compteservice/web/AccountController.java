package com.example.compteservice.web;

import com.example.compteservice.entities.Account;
import com.example.compteservice.repositories.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("account-api/v1")
@AllArgsConstructor
public class AccountController {

    private final AccountRepository accountRepository;

    @GetMapping("/list")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    @PostMapping("")
    public Account addAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }


    @DeleteMapping("{id}")
    public void deleteAccountById(@PathVariable Long id){
        accountRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Account updateAccount(@PathVariable Long id,@RequestBody Account account){
        Account accountFetchedFromDB = accountRepository.findById(id)
                                                    .orElseThrow(() ->
                                                    new IllegalArgumentException("no user found with ths id " + id));
        account.setId(accountFetchedFromDB.getId());
        return accountRepository.save(account);
    }

}
