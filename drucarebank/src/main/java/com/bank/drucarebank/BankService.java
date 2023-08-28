package com.bank.drucarebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankService {
    @Autowired
    private BankDao bankDao;

    public Bank insert(Bank bank) {
        return bankDao.insert(bank);

    }

    public int update(Bank bank) {
        return bankDao.update(bank);

    }

    public Bank updateData(Bank bank) {
        return bankDao.updateData(bank);

    }

    public List<Bank> getBank() {
        return	bankDao.getBank();

    }

    public void deleteById(int userid) {
        bankDao.deleteById(userid);

    }



}
