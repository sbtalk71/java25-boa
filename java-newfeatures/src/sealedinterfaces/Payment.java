package sealedinterfaces;

public sealed interface Payment permits UPIPayment {
    public void pay(double amount);
}
