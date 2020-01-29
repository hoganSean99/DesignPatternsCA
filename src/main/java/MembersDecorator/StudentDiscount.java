package MembersDecorator;

public class StudentDiscount extends MemberDiscount {

    public StudentDiscount()
    {
        MemberType = "Student Member Discount";
    }

    @Override
    public double discountRate()
    {
        return 0.1;
    }
}
