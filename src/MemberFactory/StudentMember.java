package MemberFactory;

import java.awt.event.ActionEvent;

public class StudentMember extends Member {
    public StudentMember()
    {
//        memberType = "Student Member";
//        name = "Sean Hogan";
//        age = 20;
//        address = "9 HuntesWood, ballyseedy, Tralee, Co. Kerry";
//
//        //address = "9 Hunters Wood, Ballyseedy, Tralee, Co. Kerry";
//        duration = 1;

        UI_forFactory UI = new UI_forFactory();

                String memberNameText = UI.nameText.getText();
                String memberTypeText = UI.memberType.getSelectedItem().toString();
//                int    memberAgeText  = UI.Integer.parseInt(ageText.getText());
                String memberAddress  = UI.addressText.getText();
//                int    memberDuration = UI.durationText.getText();
                String memberAgeText  = UI.ageText.getText();
                String memberDuration = UI.durationText.getText();

        memberType = memberTypeText;
        name = memberNameText;
        age = Integer.parseInt(memberAgeText);
        address = memberAddress;
        //address = "9 Hunters Wood, Ballyseedy, Tralee, Co. Kerry";
        duration = Integer.parseInt(memberDuration);
    }
}
