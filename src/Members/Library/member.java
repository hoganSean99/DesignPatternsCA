package Members.Library;

abstract class member {

    int    discountedPrice   = 0;
    String memberDescription = "Unknown Member Type";

    public abstract double getMemberDiscountRate();

    public String getMemberDescription()
    {
        return memberDescription;
    }
}
