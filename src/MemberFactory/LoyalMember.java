package MemberFactory;

import java.util.Objects;

public class LoyalMember extends Member {

    public LoyalMember() {

//        UI_forFactory UI = new UI_forFactory();
//
//        memberType = Objects.requireNonNull(UI.memberType.getSelectedItem()).toString();
//        name       = UI.nameText.getText();;
//        age        = UI.ageText.getText();
//        address    = UI.addressText.getText();
//        duration   = UI.durationText.getText();
        memberType = "Loyal";
        name     = "Maebh Breen";
        age      = "16";
        address  = "Killarney";
        duration = "10";
    }
}
