package com.example.compteservice.entities;

import com.example.compteservice.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firsName;
    private String lastName;
    private String userName;
    private String password;
    private AccountType accountType;
    private LocalDate dateOfBirth;
    private LocalDate createdAt;
    private LocalDate updatedAt;
}
