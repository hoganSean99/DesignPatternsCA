package TemplateTransaction;

public class TemplateDriver {
    public static void main (String args[])
    {
        BookTransaction purchaseBook = new PurchaseBook();
        purchaseBook.payment();

        System.out.println("\n\n");

        BookTransaction rentBook = new RentBook();
        rentBook.payment();
    }
}
