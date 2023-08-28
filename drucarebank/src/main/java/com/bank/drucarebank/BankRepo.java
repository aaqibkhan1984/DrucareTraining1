package com.bank.drucarebank;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Bank, Integer> {

    @Transactional
    @Modifying
    @Query("update Bank b set b.bankname=:name, b.address=:address, b.branch=:branch where b.ifsccode=:ifsccode")
    int updateByBankIfscCode(@PathParam("name")String name, @PathParam("address")String address, @PathParam("branch")String branch, @PathParam("ifsccode")String ifsccode);



}
