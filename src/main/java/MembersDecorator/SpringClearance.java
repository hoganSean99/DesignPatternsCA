package MembersDecorator;

public class SpringClearance extends DiscountDecorator {

    public SpringClearance(MemberDiscount memberDiscount)
    {
        this.memberDiscount = memberDiscount;
    }

    public String getMemberType()
    {
        return memberDiscount.getMemberType() + " and Spring Clearance Discount";
    }

    @Override
    public double discountRate() {
        return 0.2 + memberDiscount.discountRate();
    }
}
