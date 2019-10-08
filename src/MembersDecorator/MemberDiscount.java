package MembersDecorator;

public abstract class MemberDiscount {

    String MemberType = "Unknown Member Type";

    public String getMemberType()
    {
        return MemberType;
    }

    public abstract double discountRate();
}
