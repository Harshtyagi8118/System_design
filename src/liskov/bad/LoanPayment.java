package liskov.bad;

/**
 * This is loan interface responsible for payment related operatoin on a loan account
 * LoanPayment implemented by actoal loan classed like HomeLoan, CarLoan, CreditCard Loan etc..
 * For credit card/personal loan which is unsecured foreclosure and repayment is not allowed
 */
public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseAccount();
    public void doRepayment(int amount);
}
