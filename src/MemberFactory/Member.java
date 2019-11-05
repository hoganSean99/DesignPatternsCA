package MemberFactory;

import java.util.ArrayList;

public class Member {
//    String memberType, name, address;
//    int age, duration;
//    ArrayList<String> address = new ArrayList<String>();

    UI_forFactory UI = new UI_forFactory();

    String name = UI.nameText.getText();
    String memberType = UI.memberType.getSelectedItem().toString();
    String address  = UI.addressText.getText();
    String age  = UI.ageText.getText();
    String duration = UI.durationText.getText();

    public String getMemberType()
    {
        return memberType;
    }

//    public int getAge()
//    {
//        return age;
//    }
//
//    public int getDuration()
//    {
//        return duration;
//    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- " + memberType + " ----\n");
        display.append("Name : " + name + "\n");
        display.append("Age : " + age + "\n");
        display.append("Address : " + address + "\n");
        display.append("Membership Duration : " + duration + " Year/s" + "\n");
//        for (String address : address) {
//            display.append(address + "\n");
//        }
        return display.toString();
    }
}
