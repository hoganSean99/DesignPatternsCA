package FactoryEdit;

public class MemberFactoryDriver {
    public static void main(String[] args)
    {
        MemberFactory factory = new MemberFactory();
        LibraryMember library = new LibraryMember(factory);

        Member member = library.startMembership("Student");
        System.out.println(member);

        member = library.startMembership("Basic");
        System.out.println(member.getMemberType());
        System.out.println(member);

        member = library.startMembership("OAP");
        System.out.println(member.getMemberType());
        System.out.println(member);

        member = library.startMembership("Loyal");
        System.out.println(member.getMemberType());
        System.out.println(member);



    }
}
