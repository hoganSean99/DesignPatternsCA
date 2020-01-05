package MemberFactory;

import java.util.Objects;

public class BasicMember extends Member {

    public BasicMember() {

//        UI_forFactory UI = new UI_forFactory();

//        memberType = Objects.requireNonNull(UI.memberType.getSelectedItem()).toString();
//        name       = UI.nameText.getText();;
//        age        = UI.ageText.getText();
//        address    = UI.addressText.getText();
//        duration   = UI.durationText.getText();
        memberType = "Basic";
        name     = "Megan";
        age      = "20";
        address  = "Listowel";
        duration = "2";
    }
}
