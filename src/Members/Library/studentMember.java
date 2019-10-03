package Members.Library;

public class studentMember extends member{
    public studentMember()
    {
        memberDescription = "Student Discount";
    }

    @Override
    public double getMemberDiscountRate() {
        return 0.1;
    }
}
