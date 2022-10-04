package student_assignment;

import fix_assignment_danh_ba_dien_thoai.PhoneNumbers;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public Text error;
    public ListView<Students> lvStudent;
    private ObservableList<PhoneNumbers> phoneList = FXCollections.observableArrayList();

    public void studentSubmit(){
        try {
            error.setVisible(false);
            if(txtName.getText().isEmpty() || txtEmail.getText().isEmpty()||txtMark.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên và số điện thoại");
            }
//
            printResult();
        }catch (Exception e){
            errors.setText(e.getMessage());
            errors.setVisible(true);
        }
    }

    public void updatePhone(){
        for(PhoneNumbers p:phoneList){
            if(p.getName().equals(txtName.getText())){
                p.setPhone(txtPhone.getText());
                return;
            }
        }
        phoneList.add(new PhoneNumbers(txtName.getText(),txtPhone.getText()));
    }

    public void printResult(){
        lv.setItems(phoneList);
        lv.refresh();
    }
}
