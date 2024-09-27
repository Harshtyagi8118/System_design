package singleResponsibility;

import java.util.HashMap;
import java.util.Map;

public class AccountOperation {
    private static Map<Integer,Account> accountMap = new HashMap<>();
    public void addAcount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }
    public void updateAccount(Account account){
        accountMap.put(account.getAccountNumber(),account);
    }
    public Account getAccount(int accountNumber){
        return accountMap.get(accountNumber);
    }
    /**Below operation should not be part of account operations
     * Reason is accountOperation is only responsible for
     * account related operation like create, update , delete (or basic CRUD
     * operations) but deposit is something related to transaction.
     *
     * Adding this method violated single responsibility principle
     * for that we will create new class that will do the transactionOperations
     */

    public void deposit(int amount, int accountNUmber){
        //we will move this method to different class
    }

}
