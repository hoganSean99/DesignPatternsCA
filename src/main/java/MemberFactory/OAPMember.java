package MemberFactory;

import java.util.Objects;

public class OAPMember extends Member {
    public OAPMember() {

//        UI_forFactory UI = new UI_forFactory();

//        memberType = Objects.requireNonNull(UI.memberType.getSelectedItem()).toString();
//        name       = UI.nameText.getText();;
//        age        = UI.ageText.getText();
//        address    = UI.addressText.getText();
//        duration   = UI.durationText.getText();
        memberType = "OAP";
        name     = "John Mangan";
        age      = "73";
        address  = "Ardfert";
        duration = "10";
    }
}
