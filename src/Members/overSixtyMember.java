package Members;

public class overSixtyMember extends member {
    public overSixtyMember()
    {
        memberDescription = "Over 60 Member";
    }

    @Override
    public double getMemberDiscountRate() {
        // 20% Discount
        return 0.2;
    }
}
