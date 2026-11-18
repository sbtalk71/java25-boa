package sealedclasses;

public abstract sealed class Payment permits CreditCardPayment,WalletPayment,UPIPayment {
    public abstract void pay(double amount);
}
