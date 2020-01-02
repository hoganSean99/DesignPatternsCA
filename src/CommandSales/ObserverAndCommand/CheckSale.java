package CommandSales.ObserverAndCommand;

import java.util.ArrayList;

public class CheckSale implements Subject{
    private String sale;
    Sale sales = new Sale(sale);

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String SaleType;
    public String CheckSaleOn;

    public CheckSale(String SaleType, String CheckSaleOn)
    {
        super();
        this.SaleType = SaleType;
        this.CheckSaleOn = CheckSaleOn;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }
    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }
    public String getSaleType() {
        return SaleType;
    }
    public void setSaleType(String SaleType) {
        this.SaleType = SaleType;
    }


    public String getSale() {
        return CheckSaleOn;
    }

    public void setSale(String CheckSaleOn) {
        this.CheckSaleOn = CheckSaleOn;
        notifyObservers();
    }

    public void notifyObservers() {
        System.out.println("");
        for (Observer ob : observers) {
            ob.update(this.CheckSaleOn );
        }

    }

    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
