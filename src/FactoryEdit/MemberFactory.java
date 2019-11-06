package FactoryEdit;

public class MemberFactory {

    Member createMember(String type) {
        Member member = null;

        switch (type) {
            case "Student":
                member = new StudentMember();
                break;
            case "Loyal":
                member = new LoyalMember();
                break;
            case "OAP":
                member = new OAPMember();
                break;
            case "Basic":
                member = new BasicMember();
                break;
        }

        return member;
    }
}
