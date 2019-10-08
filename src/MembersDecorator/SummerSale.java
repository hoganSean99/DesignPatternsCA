package MembersDecorator;

public class SummerSale extends DiscountDecorator{

    public SummerSale(MemberDiscount memberDiscount)
    {
        this.memberDiscount = memberDiscount;
    }

    public String getMemberType()
    {
        return memberDiscount.getMemberType() + " and Summer Sale Discount";
    }

    @Override
    public double discountRate() {
        return 0.25 + memberDiscount.discountRate();
    }
}
