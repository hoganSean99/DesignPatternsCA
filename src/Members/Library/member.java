package Members.Library;

abstract class member {

    int    discountedPrice   = 0;
    String memberDescription = "Unknown Member Type";

    public double getMemberDiscountRate()
    {
        return discountedPrice;
    }

    public String getMemberDescription()
    {
        return memberDescription;
    }
}
