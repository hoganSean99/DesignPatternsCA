package MemberFactory;

public class MemberFactoryDriver {
    public static void main(String args[])
    {
        MemberFactory factory = new MemberFactory();
        LibraryMember library = new LibraryMember(factory);

        Member member = library.startMember("Student");
        System.out.println(member.getMemberType());
        System.out.println(member);

        member = library.startMember("Basic");
        System.out.println(member.getMemberType());
        System.out.println(member);

        member = library.startMember("OAP");
        System.out.println(member.getMemberType());
        System.out.println(member);

        member = library.startMember("Loyal");
        System.out.println(member.getMemberType());
        System.out.println(member);



    }
}
