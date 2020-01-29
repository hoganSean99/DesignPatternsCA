package TemplateTransaction;

public class RentBook extends BookTransaction {

    @Override
    void startTransaction()
    {
        System.out.println("Rent book transaction started");
    }
    @Override
    void startPayment()
    {
        System.out.println("No payment needed for renting");
    }
    @Override
    void confirmPayment()
    {
        System.out.println("Success - Please return the book in 7 days");
    }
    @Override
    void printReceipt()
    {
        System.out.println("Please take your receipt - Have a nice day");
    }
}
