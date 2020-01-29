package CommandSales;

public class HalfPriceStartCommand implements CommandClass {
    Half half;

    public HalfPriceStartCommand(Half half)
    {
        this.half = half;
        System.out.println("Half Price sale started");
    }

    public void execute()
    {
        half.startHalfPriceSale();
    }
}
