package MembersDecorator;

public abstract class DiscountDecorator extends MemberDiscount {

    MemberDiscount memberDiscount;

    public abstract String getMemberType();
}
