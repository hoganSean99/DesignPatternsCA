package CommandSales.TwentyPercentSale;

import CommandSales.CommandClass;

public class TwentyPercentStartCommand implements CommandClass {
    Twenty twenty;

    public TwentyPercentStartCommand(Twenty twenty)
    {
        this.twenty = twenty;
        System.out.println("20% sale started");
    }

    public void execute()
    {
        twenty.startTwentyPercentSale();
    }
}
