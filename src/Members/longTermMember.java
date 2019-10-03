package Members;

public class longTermMember extends member {
    public longTermMember()
    {
        memberDescription = "Long Term Member";
    }

    @Override
    public double getMemberDiscountRate() {
        // 7% Discount
        return 0.07;
    }
}
