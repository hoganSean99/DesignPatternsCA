package Members;

public class DiscountCode extends memberDecorator{

    public DiscountCode(member member)
    {
        this.member = member;
    }


    public double getMemberDiscountRate() {
        return member.getMemberDiscountRate() + (.2);
    }

    public String getMemberDescription()
    {
        return member.getMemberDescription() + " - With Discount Code";
    }
}
