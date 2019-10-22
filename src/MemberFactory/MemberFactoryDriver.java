package MemberFactory;

public class MemberFactoryDriver {
    public static void main(String args[])
    {
        MemberFactory factory = new MemberFactory();
        LibraryMember library = new LibraryMember(factory);

        Member member = library.startMember("student");
        System.out.println(member.getMemberType());
        System.out.println(member);



    }
}
