package MembersDecorator;

public class MemberDiscountDriver {
    public static void main(String args[]) {

        MemberDiscount Student = new StudentDiscount();
        System.out.println(Student.getMemberType() + "\n"
                + "Discount Rate of : " + Student.discountRate());

        System.out.println("\n\n");

        MemberDiscount StudentWithHalfPrice = new StudentDiscount();
        StudentWithHalfPrice = new HalfPrice(StudentWithHalfPrice);
        System.out.println(StudentWithHalfPrice.getMemberType() + "\n"
                + "Discount Rate of : " + StudentWithHalfPrice.discountRate());
    }
}
