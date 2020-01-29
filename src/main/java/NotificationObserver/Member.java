package NotificationObserver;

public class Member implements Observer {

    String memberName;

    public Member(String memberName)
    {
        this.memberName = memberName;
    }


    public String getMemberName()
    {
        return memberName;
    }

    public void setMemberName(String memberName)
    {
        this.memberName = memberName;
    }

    public void update(String availabiliy) {

        System.out.println("Hello "+ memberName + ",  The book is now " + availabiliy + " in your local library");
    }
}
