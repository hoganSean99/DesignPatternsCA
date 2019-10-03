package Members.Library;

public class overSixtyMember extends member {
    public overSixtyMember()
    {
        memberDescription = "Over 60 Member Discount";
    }

    @Override
    public double getMemberDiscountRate() {
        // 20% Discount
        return 0.2;
    }
}
