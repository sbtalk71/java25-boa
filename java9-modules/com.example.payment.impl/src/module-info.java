module com.example.payment.impl {
    requires com.example.spi;
    provides com.payment.spi.PaymentService with com.payment.cc.impl.CreditCardPayment;
}