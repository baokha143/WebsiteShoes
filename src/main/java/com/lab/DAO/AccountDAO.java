package com.lab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Entity.Account;

public interface AccountDAO extends JpaRepository<Account, Integer>{

}
