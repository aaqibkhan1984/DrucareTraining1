package com.bank.drucarebank;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bankid;

    private String bankname;

    private String ifsccode;

    private String branch;

    private String address;

    public Bank() {

    }

    public Bank(int bankid, String bankname, String ifsccode, String branch, String address) {
        this.bankid = bankid;
        this.bankname = bankname;
        this.ifsccode = ifsccode;
        this.branch = branch;
        this.address = address;
    }

    public int getBankid() {
        return bankid;
    }

    public void setBankid(int bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getIfsccode() {
        return ifsccode;
    }

    public void setIfsccode(String ifsccode) {
        this.ifsccode = ifsccode;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankid=" + bankid +
                ", bankname='" + bankname + '\'' +
                ", ifsccode='" + ifsccode + '\'' +
                ", branch='" + branch + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
