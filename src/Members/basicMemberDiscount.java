package Members;

public class basicMemberDiscount extends member {
    public basicMemberDiscount()
    {
        memberDescription = "Basic Member";
    }

    @Override
    public double getMemberDiscountRate()
    {
        // 2% Discount
        return 0.02;
    }

}
