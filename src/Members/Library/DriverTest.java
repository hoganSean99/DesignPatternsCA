package Members.Library;

public class DriverTest {
    public static void main(String args[])
    {
        member student = new studentMember();
        System.out.println(student.getMemberDescription());

        member basic   = new basicMemberDiscount();
        System.out.println(basic.getMemberDescription());

    }
}
