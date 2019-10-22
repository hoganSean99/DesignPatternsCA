package MemberFactory;

import java.util.ArrayList;

public class Member {
    String name;
    int age, duration;
    ArrayList<String> address = new ArrayList<String>();

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getDuration()
    {
        return duration;
    }
}
