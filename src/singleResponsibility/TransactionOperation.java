package singleResponsibility;

import java.math.BigDecimal;

public class TransactionOperation {
    public void deposit(BigDecimal amount, int accountNumber){
        // logic
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().add(amount));
    }
    public void withdraw(BigDecimal amount , int accountNumber){
        //logic
        /** if amount >= amountPresentInAccount
         *   Then withdraw
         *  else
         *   insufficient amount
         */
        AccountOperation accountOperation = new AccountOperation();
        Account account = accountOperation.getAccount(accountNumber);
        account.setTotalAmount(account.getTotalAmount().subtract(amount));

    }
}
