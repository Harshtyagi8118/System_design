package liskov.bad;


/**
 * When we are passing HomeLoan in LoanPayment then
 * the foreCloseLoan will work propery
 * but for CreditCardLoan it will throw an exception
 *
 */
public class LoanClosureService {
    private  LoanPayment loanPayment;
    public LoanClosureService(LoanPayment loanPayment){
        this.loanPayment = loanPayment;
    }
    public void foreCloseLoan(){
        loanPayment.foreCloseAccount();
    }
}
