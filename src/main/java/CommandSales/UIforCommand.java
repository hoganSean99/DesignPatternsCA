package CommandSales;

import CommandSales.ObserverAndCommand.CheckSale;
import CommandSales.ObserverAndCommand.Sale;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIforCommand extends JFrame {

    public static void main(String args[])
    {
        new UIforCommand();
    }

    private JButton StartHalfPriceSaleButton = new JButton("Start Half Price");
    private JButton StopHalfPriceSaleButton  = new JButton("Stop Half Price");

    private JButton StartTwentyPercentSaleButton = new JButton("Start 20% Sale");
    private JButton StopTwentyPercentSaleButton  = new JButton("Stop 20% Sale");

    public UIforCommand()
    {
        Clicklistener click = new Clicklistener();

        JFrame frame = new JFrame("Sales");



        StartHalfPriceSaleButton.setBounds(50, 100, 200, 70);
        StopHalfPriceSaleButton.setBounds(260, 100, 200, 70);

        StartTwentyPercentSaleButton.setBounds(50, 200, 200, 70);
        StopTwentyPercentSaleButton.setBounds(260, 200, 200, 70);

        frame.add(StartHalfPriceSaleButton);
        frame.add(StopHalfPriceSaleButton);

        frame.add(StartTwentyPercentSaleButton);
        frame.add(StopTwentyPercentSaleButton);

        StartHalfPriceSaleButton.addActionListener(click);
        StopHalfPriceSaleButton.addActionListener(click);

        StartTwentyPercentSaleButton.addActionListener(click);
        StopTwentyPercentSaleButton.addActionListener(click);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setBackground(Color.blue);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private class Clicklistener implements ActionListener
    {
        SaleCommand sale = new SaleCommand();
        Half halfPrice = new Half();
        Twenty twenty = new Twenty();

        CheckSale halfObserver = new CheckSale("Half Price Sale", "Not Active");
        CheckSale twentyObserver = new CheckSale("20% Sale", "Not Active");
        Sale HalfPriceObserver = new Sale("Half Price");
        Sale TwentyPercentObserver = new Sale("20%");

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == StartHalfPriceSaleButton)
            {
                //Half Price Start
                CommandClass StartHalfPrice = new HalfPriceStartCommand(halfPrice);
                sale.setCommand(StartHalfPrice);
                sale.Sale();
                //Observer
                halfObserver.setSale("Active");
            }

            else if(e.getSource() == StopHalfPriceSaleButton)
            {
                    if (halfObserver.CheckSaleOn.equals("Active"))
                    {
                        //Half Price Stop
                        CommandClass StopHalfPrice = new HalfPriceStopCommand(halfPrice);
                        sale.setCommand(StopHalfPrice);
                        sale.Sale();
                        //Observer
                        halfObserver.setSale("Not Active");
                }
                    else if (halfObserver.CheckSaleOn.equals("Not Active"))
                    {
                        //Observer
                        halfObserver.registerObserver(HalfPriceObserver);
                        halfObserver.setSale("Not Active");
                        halfObserver.removeObserver(HalfPriceObserver);
                    }
            }

            else if(e.getSource() == StartTwentyPercentSaleButton)
            {
                //20% Price Start
                CommandClass StartTwentyPercentSale = new TwentyPercentStartCommand(twenty);
                sale.setCommand(StartTwentyPercentSale);
                sale.Sale();
                twentyObserver.setSale("Active");
            }

            else if(e.getSource() == StopTwentyPercentSaleButton)
            {
                if (twentyObserver.CheckSaleOn.equals("Active"))
                {
                    //20% Stop
                    CommandClass StopTwenty = new TwentyPercentStopCommand(twenty);
                    sale.setCommand(StopTwenty);
                    sale.Sale();
                    //Observer
                    twentyObserver.setSale("Not Active");
                }
                else if (halfObserver.CheckSaleOn.equals("Not Active"))
                {
                    //Observer
                    twentyObserver.registerObserver(TwentyPercentObserver);
                    twentyObserver.setSale("Not Active");
                    twentyObserver.removeObserver(TwentyPercentObserver);
                }
            }
            }
        }
    }
