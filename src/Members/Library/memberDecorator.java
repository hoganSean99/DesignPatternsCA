package Members.Library;

public abstract class memberDecorator extends member{

    protected member memberDiscount;
    public abstract String getDescription();

    public memberDecorator(member memberDiscount)
    {
        this.memberDiscount = memberDiscount;
    }

    public double memberDiscountRate()
    {
        return memberDiscount.getMemberDiscountRate();
    }
}
