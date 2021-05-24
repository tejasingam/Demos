package com.example;

import java.util.UUID;

public class Tester {
    public static void main(String[] args) {

        Account myAccount = new Account();
        String str[] = UUID.randomUUID().toString().split("-");
        myAccount.setAccountId(str[0]);
        myAccount.setAccountName("Teja Pavan Sai");
        myAccount.setAccountType(AccountType.LOAN);
        myAccount.setAmount(5000);
        System.out.println(myAccount); //The two method will be called directly cause it is an overridden method
        //System.out.printf("Account Number %s Account Name %s Account Type %s Amount %d",myAccount.getAccountId(),myAccount.getAccountName(),myAccount.getAccountType(),myAccount.getAmount());

    }
}
