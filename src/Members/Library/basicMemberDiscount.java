package Members.Library;

public class basicMemberDiscount extends member {

    @Override
    public double getMemberDiscountRate()
    {
        return 0.02;
    }

    @Override
    public String getMemberDescription() {
        return "Basic Member";
    }
}
