package CommandSales;

import CommandSales.HalfPrice.Half;
import CommandSales.HalfPrice.HalfPriceStartCommand;
import CommandSales.HalfPrice.HalfPriceStopCommand;

public class CommandDriver {
    public static void main(String[] args)
    {
        SaleCommand sale = new SaleCommand();
        Half halfPrice = new Half();
        CommandClass StartHalfPrice = new HalfPriceStartCommand(halfPrice);
        CommandClass StopHalfPrice = new HalfPriceStopCommand(halfPrice);

//        //Half Price Start
//        sale.setCommand(StartHalfPrice);
//        sale.Sale();
//
//        //Half Price Stop
//        sale.setCommand(StopHalfPrice);
//        sale.Sale();

    }
}
