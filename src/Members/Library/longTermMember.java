package Members.Library;

public class longTermMember extends member {
    public longTermMember()
    {
        memberDescription = "Long Term Member Discount";
    }

    @Override
    public double getMemberDiscountRate() {
        return 0.07;
    }
}
