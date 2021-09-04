package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, String> {

}

