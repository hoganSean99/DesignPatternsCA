package BookStratagy;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class UIStrat {
    public static void main(String[] args) {
        JFrame f = new JFrame("Place Book Order");
        f.setSize(300, 150);
        f.setLocation(200, 200);
        f.addWindowListener(new WindowAdapter( ) {
            public void windowClosing(WindowEvent we) { System.exit(0); }
        });

        JPanel genrePanel = new JPanel( );
        final ButtonGroup genreGroup = new ButtonGroup( );
        JRadioButton radioButton;
        genrePanel.add(radioButton = new JRadioButton("Horror"));
        radioButton.setActionCommand("Horror");
        genreGroup.add(radioButton);

        genrePanel.add(radioButton = new JRadioButton("Thriller"));
        radioButton.setActionCommand("Thriller");
        genreGroup.add(radioButton);


//        CheckboxGroup cg = new CheckboxGroup();
//        Checkbox hardCover = new Checkbox("Hard Cover");
//        Checkbox softCover = new Checkbox("Soft Cover");


        JCheckBox hardCover = new JCheckBox("Hard Cover");
        JCheckBox softCover = new JCheckBox("Soft Cover");

        hardCover.setVisible(true);
        softCover.setVisible(true);

//        hardCover.setBounds(20, 100, 30, 100);
//        softCover.setBounds(50, 100, 30, 100);

        f.add(hardCover);
        f.add(softCover);



        JPanel orderPanel = new JPanel( );
        JButton orderButton = new JButton("Place Order");
        orderPanel.add(orderButton);

        Container content = f.getContentPane( );
        content.setLayout(new GridLayout(3, 1));
        content.add(genrePanel);
        content.add(orderPanel);

          final Book[] book = new Book[1];

        orderButton.addActionListener(new ActionListener( ) {
            public void actionPerformed(ActionEvent ae) {
                String genre = genreGroup.getSelection().getActionCommand( );
                switch (genre) {
                    case "Horror":
                        book[0] = new HorrorBook();
                        System.out.println(book[0].display());
                        break;
                    case "Thriller":
                        book[0] = new ThrillerBook();
                        System.out.println(book[0].display());
                        break;
                }

                if (hardCover.isSelected()) {
                    book[0].setCoverBehaviour(new HardCover());
                    System.out.println("With " + book[0].cover());
                } else if (softCover.isSelected()) {
                    book[0].setCoverBehaviour(new SoftCover());
                    System.out.println("With " + book[0].cover());
                }


                }

        });

        f.setVisible(true);
    }
}