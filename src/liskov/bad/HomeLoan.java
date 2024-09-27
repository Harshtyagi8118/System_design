package liskov.bad;

public class HomeLoan implements LoanPayment{
    @Override
    public void doPayment(int amount) {

    }

    @Override
    public void foreCloseAccount() {

    }

    @Override
    public void doRepayment(int amount) {

    }
}
