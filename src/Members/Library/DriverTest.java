package Members.Library;

public class DriverTest {
    public static void main(String args[])
    {

        member student = new studentMember();
        student = new DiscountCode(student);
        System.out.println(student.getMemberDescription() + "\n"
                            + "Discount Rate = " + student.getMemberDiscountRate());

    }
}
