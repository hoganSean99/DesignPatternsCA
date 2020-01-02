package CommandSales.HalfPrice;

import CommandSales.CommandClass;

public class HalfPriceStopCommand implements CommandClass {
    Half half;

    public HalfPriceStopCommand(Half half)
    {
        this.half = half;
        System.out.println("Half Price sale ended");
    }

    public void execute()
    {
        half.stopHalfPriceSale();
    }
}
