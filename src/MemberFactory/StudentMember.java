package MemberFactory;

import java.util.Objects;

public class StudentMember extends Member {
    public StudentMember()
    {

//        UI_forFactory UI = new UI_forFactory();

//        memberType = Objects.requireNonNull(UI.memberType.getSelectedItem()).toString();
//        name       = UI.nameText.getText();;
//        age        = UI.ageText.getText();
//        address    = UI.addressText.getText();
//        duration   = UI.durationText.getText();

        name     = "Sean Hogan";
        age      = "22";
        address  = "Hunters Wood";
        duration = "5";
    }
}
