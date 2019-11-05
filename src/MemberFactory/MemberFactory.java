package MemberFactory;

public class MemberFactory {
    public Member createMember(String type)
    {
        Member member = null;

        if (type.equals("Student")) {
            member = new StudentMember();
        } else if (type.equals("OAP")) {
            member = new OAPMember();
        } else if (type.equals("Basic")) {
            member = new BasicMember();
        } else if (type.equals("Loyal")) {
            member = new LoyalMember();
        }

        return member;
    }
}
