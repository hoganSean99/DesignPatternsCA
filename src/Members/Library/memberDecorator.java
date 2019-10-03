package Members.Library;

public abstract class memberDecorator extends member{

    public member member;
    public abstract String getMemberDescription();

//    public memberDecorator(member memberDiscount)
//    {
//        this.member = memberDiscount;
//    }

//    public double DiscountRate getMemberDiscountRate()
//    {
//        return member.getMemberDiscountRate();
//    }
}
