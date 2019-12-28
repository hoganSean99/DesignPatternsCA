package NotificationObserver;

import java.util.ArrayList;

public class Product implements Subject {

    private String memberName;
    Member mem = new Member(memberName);

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String bookName;
    private String transactionType;
    public String availability;

    public Product(String bookName, String transactionType, String availability)
    {
        super();
        this.bookName = bookName;
        this.transactionType = transactionType;
        this.availability = availability;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }
    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        notifyObservers();
    }

    public void notifyObservers() {
        System.out.println("Notification to the members enquiring about a book when it becomes available");
        for (Observer ob : observers) {
            ob.update(this.availability );
        }

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
