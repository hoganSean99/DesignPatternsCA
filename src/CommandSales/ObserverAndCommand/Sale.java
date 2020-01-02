package CommandSales.ObserverAndCommand;

    public class Sale extends Observer {

        String sale;

        public Sale(String sale) {
            this.sale = sale;
        }


        public void update(String CheckSaleOn) {

            System.out.println(sale + " sale is " + CheckSaleOn + "." +
                    " \n You cannot stop a sale that is not active");
        }
    }
