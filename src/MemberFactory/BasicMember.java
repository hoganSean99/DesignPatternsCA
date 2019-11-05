package MemberFactory;

public class BasicMember extends Member {

    public BasicMember() {

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
