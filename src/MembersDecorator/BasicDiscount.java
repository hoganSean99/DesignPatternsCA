package MembersDecorator;

public class BasicDiscount extends MemberDiscount {

    public BasicDiscount()
    {
        MemberType = "Basic Member Discount";
    }

    @Override
    public double discountRate()
    {
        return 0.2;
    }
}
