package MemberFactory;

import java.util.ArrayList;

public class Member {
    String memberType, name, address;
    int age, duration;
//    ArrayList<String> address = new ArrayList<String>();

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
