//package MemberFactory;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.Objects;
//import javax.swing.JFrame;
//import javax.swing.*;
//
//
//
//public class UI_forFactory extends JFrame implements ActionListener
//{
//    private JFrame userInterface = new JFrame();
//
//
//    JTextField  nameText     = new JTextField();
//    JTextField  addressText  = new JTextField();
//    JTextField  durationText = new JTextField();
//    JTextField  ageText      = new JTextField();
////    ButtonGroup bg          = new ButtonGroup();
//    JComboBox<ComboItem> memberType;
//    private JButton     b            = new JButton("SUBMIT");
//
//    class ComboItem
//    {
//        private String key;
//        private String value;
//
//        public ComboItem(String key, String value)
//        {
//            this.key = key;
//            this.value = value;
//        }
//
//        @Override
//        public String toString()
//        {
//            return key;
//        }
//
//        public String getKey()
//        {
//            return key;
//        }
//
//        public String getValue()
//        {
//            return value;
//        }
//    }
//
//    UI_forFactory()
//    {
//
//
//        JLabel name = new JLabel("NAME");
//        name.setBounds(100,50,200,40);
//        JLabel age = new JLabel("AGE");
//        age.setBounds(100,100,200,40);
//        JLabel address = new JLabel("ADDRESS");
//        address.setBounds(100,150,200,40);
//        JLabel type = new JLabel("SELECT MEMBER TYPE");
//        type.setBounds(100,200,200,40);
//        JLabel duration = new JLabel("MEMBERSHIP DURATION");
//        duration.setBounds(100,250,200,40);
//
//        add(name);
//        add(age);
//        add(address);
//        add(type);
//        add(duration);
//
//        nameText.setBounds(260,50,120,30);
//        ageText.setBounds(260,100,120,30);
//        addressText.setBounds(260,150,120,30);
//        memberType = new JComboBox<ComboItem>();
//        memberType.setBounds(260,200,120,30);
//        durationText.setBounds(260,250,120,30);
//
//        memberType.addItem(new ComboItem("OAP", "OAP"));
//        memberType.addItem(new ComboItem("Student", "Student"));
//        memberType.addItem(new ComboItem("Loyal", "Loyal"));
//        memberType.addItem(new ComboItem("Basic", "Basic"));
//
//        add(nameText);
//        add(ageText);
//        add(addressText);
//        add(memberType);
//        add(durationText);
//
//        nameText.isVisible();
//        ageText.isVisible();
//        addressText.isVisible();
//        memberType.isVisible();
//        durationText.isVisible();
//
//        b.setBounds(100,320,100,30);
//        add(b);
//        b.addActionListener(this);
//
//        this.setLayout(null);
//        this.setVisible(true);
//        this.setSize(500,400);
//    }
//
//
//
//    public void actionPerformed(ActionEvent ar)
//    {
//            MemberFactory factory = new MemberFactory();
//            LibraryMember library = new LibraryMember(factory);
////
//            String memberTypeText = Objects.requireNonNull(memberType.getSelectedItem()).toString();
////
//            Member member = library.startMember(memberTypeText);
////
////
//            System.out.println("Name is : "        + nameText.getText());
//            System.out.println("Member Type is : " + memberTypeText);
//            System.out.println("Address is : "     + addressText.getText());
//            System.out.println("Age is : "         + ageText.getText());
//            System.out.println("Duration is : "    + durationText.getText());
//////
//////
//            System.out.println(member.getMemberType());
////            System.out.println(member.toString());
//
//    }
//
//    public static void main(String[] args)
//    {
//        new UI_forFactory();
//    }
//}
