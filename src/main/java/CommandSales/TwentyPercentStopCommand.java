package CommandSales;

public class TwentyPercentStopCommand implements CommandClass {
    Twenty twenty;

    public TwentyPercentStopCommand(Twenty twenty)
    {
        this.twenty = twenty;
        System.out.println("20% sale Stopped");
    }

    public void execute()
    {
        twenty.stopTwentyPercentSale();
    }
}
