package Members;

public class studentMember extends member{
    public studentMember()
    {
        memberDescription = "Student Member";
    }

    @Override
    public double getMemberDiscountRate() {
        // 10% Discount
        return 0.1;
    }
}
