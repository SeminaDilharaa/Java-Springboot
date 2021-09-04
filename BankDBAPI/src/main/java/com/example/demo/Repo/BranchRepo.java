package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.Model.Branch;

@Repository
public interface BranchRepo extends JpaRepository<Branch, String> {

}
