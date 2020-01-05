package TemplateTransaction;

public abstract class BookTransaction {
    abstract void startTransaction();
    abstract void startPayment();
    abstract void confirmPayment();
    abstract void printReceipt();

    public final void payment()
    {
        startTransaction();
        startPayment();
        confirmPayment();
        printReceipt();
    }
}
