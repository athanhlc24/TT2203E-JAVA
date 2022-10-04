package student_assignment;

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
    private ObservableList<Students> studentList = FXCollections.observableArrayList();

    public void studentSubmit(){
        try {
            Integer mark = Integer.parseInt(txtMark.getText());
            if(txtName.getText().isEmpty() || txtEmail.getText().isEmpty()||txtMark.getText().isEmpty()||!txtEmail.getText().contains("@")||mark<0||mark>100){
                throw new Exception("Vui lòng nhập đầy đủ tên, email và điểm");
            }
            studentList.add(new Students(txtName.getText(),txtEmail.getText(),mark));
            lvStudent.setItems(studentList);
            lvStudent.refresh();
            clearInput();
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }

    }
    public void clearInput(){
        txtName.setText("");
        txtEmail.setText("");
        txtMark.setText("");
    }

}
