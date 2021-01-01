package com.java.Soru4.Account;

import java.util.Set;
import java.util.TreeSet;

public class AccountManager {
	
	Set<Account> accountsTreeSet = new TreeSet<>();

    public AccountManager(Set<Account> accountsTreeSet) {
        this.accountsTreeSet = accountsTreeSet;
    }

    public Account login() {
        for (Account account : accountsTreeSet){
            if (account != null){
                try {
                    account.isInvalid();
                }catch (InvalidAuthenticationException e){
                    e.printStackTrace();
                }
            }else {
                return null;
            }
        }
        return null;
    }



    public Set<Account> getAccountsTreeSet() {
        return accountsTreeSet;
    }

    public void setAccountsTreeSet(Set<Account> accountsTreeSet) {
        this.accountsTreeSet = accountsTreeSet;
    }

}
