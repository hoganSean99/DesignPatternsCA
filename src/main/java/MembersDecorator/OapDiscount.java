package MembersDecorator;

public class OapDiscount extends MemberDiscount{

    public OapDiscount()
    {
        MemberType = "Old Aged Pensioner Discount";
    }

    @Override
    public double discountRate()
    {
        return 0.2;
    }
}
