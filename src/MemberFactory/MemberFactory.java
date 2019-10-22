package MemberFactory;

public class MemberFactory {
    public Member createMember(String type)
    {
        Member member = null;

        if (type.equals("student")) {
            member = new StudentMember();
        } else if (type.equals("oap")) {
            member = new OAPMember();
        } else if (type.equals("basic")) {
            member = new BasicMember();
        } else if (type.equals("loyal")) {
            member = new LoyalMember();
        }

        return member;
    }
}
