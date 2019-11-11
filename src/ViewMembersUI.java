import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ViewMembersUI extends JFrame {

    public static void main(String[] args)
    {
        new ViewMembersUI();
    }

    private JButton studentButton = new JButton("Student Members");
    private JButton OAPButton     = new JButton("OAP Members");
    private JButton loyalButton   = new JButton("Loyal Members");
    private JButton basicButton   = new JButton("Basic Members");

    ViewMembersUI()
    {
        Clicklistener click = new Clicklistener();

        JFrame frame = new JFrame("Library System");



        studentButton.setBounds(50, 100, 200, 70);
        OAPButton.setBounds(260, 100, 200, 70);
        loyalButton.setBounds(50, 200, 200, 70);
        basicButton.setBounds(260, 200, 200, 70);

        frame.add(studentButton);
        frame.add(OAPButton);
        frame.add(loyalButton);
        frame.add(basicButton);

        studentButton.addActionListener(click);
        OAPButton.addActionListener(click);
        loyalButton.addActionListener(click);
        basicButton.addActionListener(click);

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
            if(e.getSource() == studentButton)
            {
                File file = new File("Student.txt");
                if(file.exists())
                {
                    String fileName = "Student.txt";
                    getMembers(fileName);
                }
                else
                {
                    System.out.println("No Student members");
                }
            }

            else if(e.getSource() == OAPButton)
            {
                File file = new File("OAP.txt");
                if(file.exists())
                {
                    String fileName = "OAP.txt";
                    getMembers(fileName);
                }
                else
                {
                    System.out.println("No OAP members");
                }
            }

            else if(e.getSource() == loyalButton)
            {
                File file = new File("Loyal.txt");
                if(file.exists())
                {
                    String fileName = "Loyal.txt";
                    getMembers(fileName);
                }
                else
                {
                    System.out.println("No Loyal members");
                }
            }

            else if(e.getSource() == basicButton)
            {
                File file = new File("Basic.txt");
                if(file.exists())
                {
                    String fileName = "Basic.txt";
                    getMembers(fileName);

                }
                else
                {
                    System.out.println("No Basic members");
                }
            }
        }

        private void getMembers(String fileName) {
            String line;
            try {
                FileReader fileReader         = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }
                bufferedReader.close();
            }
            catch(FileNotFoundException ex)
            {
                System.out.println("Unable to open file '" + fileName + "'");
            }
            catch(IOException ex)
            {
                System.out.println("Error reading file '" + fileName + "'");
            }
            System.exit(0);
        }
    }

}
