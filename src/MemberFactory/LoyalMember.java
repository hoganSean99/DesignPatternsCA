package MemberFactory;

public class LoyalMember extends Member {

    public LoyalMember() {

        UI_forFactory UI = new UI_forFactory();

        memberType = "";
        name = UI.nameText.getText();
        ;
        age = "";
        address = "";

        //address = "9 Hunters Wood, Ballyseedy, Tralee, Co. Kerry";
        duration = "";
    }
}
