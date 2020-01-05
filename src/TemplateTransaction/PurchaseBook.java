package TemplateTransaction;

public class PurchaseBook extends BookTransaction {

    @Override
    void startTransaction()
    {
        System.out.println("Purchase book payment started");
    }
    @Override
    void startPayment()
    {
        System.out.println("Please insert or tap your card");
    }
    @Override
    void confirmPayment()
    {
        System.out.println("Success - Please remove your card");
    }
    @Override
    void printReceipt()
    {
        System.out.println("Please take your receipt - Have a nice day");
    }
}
