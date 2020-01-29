package FactoryEdit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.*;



public class UI_forFactory extends JFrame implements ActionListener
{

    private JTextField  nameText     = new JTextField();
    private JTextField  addressText  = new JTextField();
    private JTextField  durationText = new JTextField();
    private JTextField  ageText      = new JTextField();

    private JComboBox<ComboItem> memberType;

    class ComboItem
    {
        private String key;

        ComboItem(String key)
        {
            this.key = key;
        }

        @Override
        public String toString()
        {
            return key;
        }

    }

    public UI_forFactory()
    {


        JLabel name = new JLabel("NAME");
        name.setBounds(100,50,200,40);
        JLabel age = new JLabel("AGE");
        age.setBounds(100,100,200,40);
        JLabel address = new JLabel("ADDRESS");
        address.setBounds(100,150,200,40);
        JLabel type = new JLabel("SELECT MEMBER TYPE");
        type.setBounds(100,200,200,40);
        JLabel duration = new JLabel("MEMBERSHIP DURATION");
        duration.setBounds(100,250,200,40);

        add(name);
        add(age);
        add(address);
        add(type);
        add(duration);

        nameText.setBounds(260,50,120,30);
        ageText.setBounds(260,100,120,30);
        addressText.setBounds(260,150,120,30);
        memberType = new JComboBox<>();
        memberType.setBounds(260,200,120,30);
        durationText.setBounds(260,250,120,30);

        memberType.addItem(new ComboItem("OAP"));
        memberType.addItem(new ComboItem("Student"));
        memberType.addItem(new ComboItem("Loyal"));
        memberType.addItem(new ComboItem("Basic"));

        add(nameText);
        add(ageText);
        add(addressText);
        add(memberType);
        add(durationText);

        nameText.isVisible();
        ageText.isVisible();
        addressText.isVisible();
        memberType.isVisible();
        durationText.isVisible();

        JButton b = new JButton("SUBMIT");
        b.setBounds(100,320,100,30);
        add(b);
        b.addActionListener(this);

        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500,400);


    }

    public static void main(String[] args)
    {
       new UI_forFactory();
    }

    public void actionPerformed(ActionEvent ar) {
        MemberFactory factory = new MemberFactory();
        LibraryMember library = new LibraryMember(factory);

        String memberTypeText = Objects.requireNonNull(memberType.getSelectedItem()).toString();
        Member member = library.startMembership(memberTypeText);

        member.name = nameText.getText();
        member.address = addressText.getText();
        member.age = ageText.getText();
        member.duration = durationText.getText();

            try
            {
                FileWriter writer = new FileWriter(memberTypeText + ".txt", true);
                    writer.write("\n" + member);
                    writer.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println(member);
            System.exit(0);
        }
    }
