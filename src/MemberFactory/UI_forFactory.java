package MemberFactory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class UI_forFactory extends JFrame implements ActionListener
{
    JFrame userInterface = new JFrame();

    JLabel name      = new JLabel("NAME");
    JLabel age       = new JLabel("AGE");
    JLabel type      = new JLabel("SELECT MEMBER TYPE");
    JLabel duration  = new JLabel("MEMBERSHIP DURATION");
    JLabel address   = new JLabel("ADDRESS");


    JTextField  nameText     = new JTextField();
    JTextField  addressText  = new JTextField();
    JTextField  durationText = new JTextField();
    JTextField  ageText      = new JTextField();
//    ButtonGroup bg          = new ButtonGroup();
    JComboBox   memberType   = new JComboBox();
    JButton     b            = new JButton("SUBMIT");

    public UI_forFactory()
    {


        name.setBounds(100,50,200,40);
        age.setBounds(100,100,200,40);
        address.setBounds(100,150,200,40);
        type.setBounds(100,200,200,40);
        duration.setBounds(100,250,200,40);

        add(name);
        add(age);
        add(address);
        add(type);
        add(duration);

        nameText.setBounds(260,50,120,30);
        ageText.setBounds(260,100,120,30);
        addressText.setBounds(260,150,120,30);
        memberType.setBounds(260,200,120,30);
        durationText.setBounds(260,250,120,30);

        memberType.addItem("Student");
        memberType.addItem("OAP");
        memberType.addItem("Loyal");
        memberType.addItem("Basic");

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
    public void actionPerformed(ActionEvent ar)
    {
        if(ar.getSource()==b)
        {
            String memberTypeText = memberType.getSelectedItem().toString();

            MemberFactory factory = new MemberFactory();
            LibraryMember library = new LibraryMember(factory);

            Member member = library.startMember(memberTypeText);
            System.out.println(member.getMemberType());
            System.out.println(member);
//            System.out.println("Hello");

//            String name = nameText.getText();
//            String memberTypeT = memberType.getSelectedItem().toString();
//            String address  = addressText.getText();
//            String age  = ageText.getText();
//            String duration = durationText.getText();
//
//            System.out.println("Name :" + name);
//            System.out.println("Type :" + memberTypeT);
//            System.out.println("Add  :" + address);
//            System.out.println("Age  :" + age);
//            System.out.println("Dura :" + duration);
        }
    }
}
