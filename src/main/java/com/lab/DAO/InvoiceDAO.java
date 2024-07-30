package com.lab.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lab.Entity.Invoice;

public interface InvoiceDAO extends JpaRepository<Invoice, Integer>{

}
