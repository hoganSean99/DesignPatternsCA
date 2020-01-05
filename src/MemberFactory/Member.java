package MemberFactory;

        import java.util.Objects;

public class Member {

    String name;
    String memberType;
    String address;
    String age;
    String duration;

    public String getMemberType()
    {
        return memberType;
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("---- ").append(memberType).append(" ----\n");
        display.append("Name : ").append(name).append("\n");
        display.append("Age : ").append(age).append("\n");
        display.append("Address : ").append(address).append("\n");
        display.append("Membership Duration : ").append(duration).append(" Year/s").append("\n");
//        for (String address : address) {
//            display.append(address + "\n");
//        }
        return display.toString();
    }
}
