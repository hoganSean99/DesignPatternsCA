package CommandSales;

import FactoryEdit.UI_forFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UIforCommand extends JFrame {

    public static void main(String args[])
    {
        new UIforCommand();
    }

    JButton StartHalfPriceSaleButton = new JButton("Start Half Price");
    JButton StopHalfPriceSaleButton  = new JButton("Stop Half Price");

    public UIforCommand()
    {
        Clicklistener click = new Clicklistener();

        JFrame frame = new JFrame("Sales");



        StartHalfPriceSaleButton.setBounds(50, 100, 200, 70);
        StopHalfPriceSaleButton.setBounds(260, 100, 200, 70);

        frame.add(StartHalfPriceSaleButton);
        frame.add(StopHalfPriceSaleButton);

        StartHalfPriceSaleButton.addActionListener(click);
        StopHalfPriceSaleButton.addActionListener(click);

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

        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == StartHalfPriceSaleButton)
            {
                //Half Price Start
                CommandClass StartHalfPrice = new HalfPriceStartCommand(halfPrice);
                sale.setCommand(StartHalfPrice);
                sale.Sale();
            }

            else if(e.getSource() == StopHalfPriceSaleButton)
            {
                //Half Price Stop
                CommandClass StopHalfPrice = new HalfPriceStopCommand(halfPrice);
                sale.setCommand(StopHalfPrice);
                sale.Sale();
            }
            }
        }
    }
