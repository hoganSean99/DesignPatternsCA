package MembersDecorator;

public class HalfPrice extends DiscountDecorator {

    public HalfPrice(MemberDiscount memberDiscount)
    {
        this.memberDiscount = memberDiscount;
    }

    public String getMemberType()
    {
        return memberDiscount.getMemberType() + " and and Half Price Discount";
    }

    @Override
    public double discountRate()
    {
        return 0.5 + memberDiscount.discountRate();
    }
}
