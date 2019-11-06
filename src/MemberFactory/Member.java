package MemberFactory;

        import java.util.Objects;

public class Member {
//    String memberType, name, address;
//    int age, duration;
//    ArrayList<String> address = new ArrayList<String>();

//    UI_forFactory UI  = new UI_forFactory();

//    String name       = UI.nameText.getText();
//    String memberType = Objects.requireNonNull(UI.memberType.getSelectedItem()).toString();
//    String address    = UI.addressText.getText();
//    String age        = UI.ageText.getText();
//    String duration   = UI.durationText.getText();

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
