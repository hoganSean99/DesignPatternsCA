package MemberFactory;

public class LibraryMember {
    MemberFactory factory;

    public LibraryMember(MemberFactory factory) {
        this.factory = factory;
    }

    public Member orderPizza(String type) {
        Member member;

        member = factory.createMember(type);

        member.name();
        member.age();
        member.address();
        member.duration();

        return member;
    }
    
}
