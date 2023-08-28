package com.bank.drucarebank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class Controller {
    @Autowired
    private BankService bankService;

    @PostMapping("/addBank")
    public Bank insert(@RequestBody Bank bank) {
        return bankService.insert(bank);

    }

    @PutMapping("/updateBank")
    public int update(@RequestBody Bank bank) {
        //System.out.println(bank);
        return bankService.update(bank);
    }

    @PutMapping("/updateBankDetails")
    public Bank updateData(@RequestBody Bank bank) {
        //System.out.println(bank);
        return bankService.updateData(bank);
    }

    @GetMapping("/getbanks")
    public List<Bank> getBanks() {
        return bankService.getBank();

    }

    @DeleteMapping("/delete/{userid}")
    public void deleteById(@PathVariable int userid) {
        bankService.deleteById(userid);
    }
}
