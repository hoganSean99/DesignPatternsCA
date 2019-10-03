package Members;

public class guest extends member{
    public guest()
    {
        memberDescription = "Guest";
    }

    @Override
    public double getMemberDiscountRate() {
        // No Discount
        return 1;
    }
}
