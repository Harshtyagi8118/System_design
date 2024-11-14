package DesignPatterns;

public class StrategyPattern {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();

        //setting payment strategy
        cart.setPaymentStrategy(new CreditCardPaymentStrategy("abcd-1234-efgh"));
        cart.checkOut(1000);


        // changing the payment strategy
        cart.setPaymentStrategy(new PayPalPaymentStrategy("payment@gmail.com"));
        cart.checkOut(2000);
    }
}

interface PaymentStrategy{
    void pay(int amount);
}

class PayPalPaymentStrategy implements PaymentStrategy{
    private String email;
    public PayPalPaymentStrategy(String email){
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount "+ amount+ " Paid using PayPalPaymentStrategy");
    }
}

class CreditCardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;
    CreditCardPaymentStrategy(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Amount " + amount + " Paid using CreditCardPaymentStrategy");
    }
}

//if new payment strategy is required we can directly implement the PaymentStrategy class and keep the seprate logic
//for it without disturbing the existing code

class ShoppingCart{
        private PaymentStrategy paymentStrategy;
        public void setPaymentStrategy(PaymentStrategy paymentStrategy){
            this.paymentStrategy = paymentStrategy;
        }
        void checkOut(int amount){
            paymentStrategy.pay(amount);
        }
}
