package FactoryEdit;

public class LibraryMember {
    private MemberFactory factory;

    public LibraryMember(MemberFactory factory)
    {
        this.factory = factory;
    }

    Member startMembership(String type)
    {
        Member member;

        member = factory.createMember(type);
        return member;
    }

}