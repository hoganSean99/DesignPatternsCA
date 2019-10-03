package Members;

public class DriverTest {
    public static void main(String args[])
    {

        member studentWithDiscount = new studentMember();
        studentWithDiscount = new DiscountCode(studentWithDiscount);
        System.out.println(studentWithDiscount.getMemberDescription() + "\n"
                            + "Discount Rate = " + studentWithDiscount.getMemberDiscountRate());

        member studentNoDiscount = new studentMember();
        System.out.println(studentNoDiscount.getMemberDescription() + "\n"
                            + "Discount Rate = " + studentNoDiscount.getMemberDiscountRate());

        System.out.println("\n \n \n \n");



        member longTermMemberWithDiscount = new longTermMember();
        longTermMemberWithDiscount = new DiscountCode(longTermMemberWithDiscount);
        System.out.println(longTermMemberWithDiscount.getMemberDescription() + "\n"
                            + "Discount Rate = " + longTermMemberWithDiscount.getMemberDiscountRate());

    }
}
