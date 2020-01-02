package CommandSales;

public class SaleCommand {
    private CommandClass sale;

    public void setCommand(CommandClass sale)
    {
        this.sale = sale;
    }

    public void StartSale(){

        sale.execute();

    }
}
