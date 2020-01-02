package NotificationObserver;

public class ObserverMain {
    public static void main(String args[])
    {

        Product Macbeth = new Product("Macbeth", "Rent", "Not Available");
        Product HarryPotter = new Product("Harry Potter", "Buy", "Not Available");

        Macbeth.registerObserver(MemberNames.Megan);
        HarryPotter.registerObserver(MemberNames.Sean);


        Macbeth.setAvailability("Not Available");
        HarryPotter.setAvailability("Available");
    }
}
