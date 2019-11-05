package MemberFactory;

public class OAPMember extends Member {
    public OAPMember() {

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
