package FactoryEdit;

 public class Member {

    String memberType;
    String name;
    String address;
    String age;
    String duration;

    public String getMemberType()
    {
        return memberType;
    }

    @Override
    public String toString() {
        StringBuffer memberString = new StringBuffer();
        memberString.append("---- " + memberType + " ----\n");
        memberString.append("Name     : " + name + "\n");
        memberString.append("Address  : " + address + "\n");
        memberString.append("Age      : " + age + "\n");
        memberString.append("Duration : " + duration + "\n");

        return memberString.toString();
    }
}