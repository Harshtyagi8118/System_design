package liskov.good;

public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan){
        this.secureLoan = secureLoan;
    }
    public void foreCloseLoan(){
        secureLoan.foreCloseLoan();
    }
}
