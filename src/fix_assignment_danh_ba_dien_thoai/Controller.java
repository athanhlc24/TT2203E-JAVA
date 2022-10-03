package fix_assignment_danh_ba_dien_thoai;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    public TextField txtName;
    public TextField txtSDT;

    public Text tName;
    public Text tSDT;

    public Text notName;
    public Text notSDT;

    private ArrayList<PhoneNumber> phoneList  = new ArrayList<>();

    public void danhbaSubmit(){
       try {
           notName.setVisible(false);
           notSDT.setVisible(false);
           if (txtName.getText().isEmpty()||txtSDT.getText().isEmpty()){
               throw new Exception("Làm ơn! hãy nhập đầy đủ các thông tin ");
           }
           phoneList.add(new PhoneNumber(txtName.getText(),txtSDT.getText()));
//           String n = txtName.getText();
//           String p = txtSDT.getText();
//           PhoneNumber pn = new PhoneNumber(n,p);
//           phoneList.add(pn);
           printDanhba();
           updatePhone();
       }catch (Exception e){
           notName.setText(e.getMessage());
           notName.setVisible(true);
           notSDT.setText(e.getMessage());
           notSDT.setVisible(true);
       }
    }
    public void printDanhba(){
        String txt = "";
        String txt2="";
        for (PhoneNumber p:phoneList) {
//            tName.setText(tName.getText()+p.toString());
//            tSDT.setText(tSDT.getText()+p.toString());
            txt +=p.toString();

        }
        for (PhoneNumber p:phoneList) {
//            tName.setText(tName.getText()+p.toString());
//            tSDT.setText(tSDT.getText()+p.toString());
            txt2 +=p.toString();

        }
        tName.setText(txt);
        tSDT.setText(txt2);

    }
    public void updatePhone(){
        for (PhoneNumber p :phoneList) {
            if (p.getName().equals(txtName.getText())){
                    p.setPhone(txtSDT.getText());
                    return;
            }
        }
        phoneList.add(new PhoneNumber(txtName.getText(),txtSDT.getText()));
    }
}
