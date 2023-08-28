package com.bank.drucarebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BankDao {

    @Autowired
    private BankRepo bankRepo;

    public Bank insert(Bank bank) {

        return bankRepo.save(bank);

    }

    public int update(Bank bank) {

        int count = bankRepo.updateByBankIfscCode(bank.getBankname(), bank.getAddress(), bank.getBranch(),
                bank.getIfsccode());
        if (count > 0) {
            return count;
        }
        return -1;

    }

    public Bank updateData(Bank bank) {
        Optional<Bank> findById = bankRepo.findById(bank.getBankid());
        if (findById.isPresent()) {
            return bankRepo.save(bank);
        }
        return null;
    }

    public List<Bank> getBank() {
        return bankRepo.findAll();

    }

    public void deleteById(int userid) {
        bankRepo.deleteById(userid);

    }
}
