package MembersDecorator;

public class LoyalDiscount extends MemberDiscount {

    public LoyalDiscount()
    {
        MemberType = "Loyal Member Discount";
    }

    @Override
    public double discountRate()
    {
        return 0.15;
    }
}
