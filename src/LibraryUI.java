import CommandSales.UIforCommand;
import FactoryEdit.UI_forFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryUI extends JFrame {

    public static void main(String args[])
    {
        new LibraryUI();
    }

    JButton membersButton   = new JButton("View Members");
    JButton addMemberButton = new JButton("Add Member");
    JButton salesButton = new JButton("Sales");

    public LibraryUI()
    {
        Clicklistener click = new Clicklistener();

        JFrame frame = new JFrame("Library System");



        membersButton.setBounds(50, 100, 200, 70);
        addMemberButton.setBounds(260, 100, 200, 70);
        salesButton.setBounds(50, 200, 200, 70);

        frame.add(membersButton);
        frame.add(addMemberButton);
        frame.add(salesButton);

        membersButton.addActionListener(click);
        addMemberButton.addActionListener(click);
        salesButton.addActionListener(click);

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(500,400);
        frame.setBackground(Color.blue);

        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    private class Clicklistener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == membersButton)
            {
                LibraryUI LUI = new LibraryUI();

                new ViewMembersUI();
                LUI.setVisible(false);
                LUI.dispose();
            }

            else if(e.getSource() == addMemberButton)
            {
                LibraryUI LUI = new LibraryUI();

                new UI_forFactory();
                LUI.setVisible(false);
                LUI.dispose();
            }
            else if(e.getSource() == salesButton)
            {
                LibraryUI LUI = new LibraryUI();

                new UIforCommand();
                LUI.setVisible(false);
                LUI.dispose();
            }
        }
    }

}
