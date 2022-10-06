package assignment_mon_hoc.addNewMonHoc;

import assignment_mon_hoc.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import student_assignment.Students;

public class Controller {
    public TextField txtName;
    public TextField txtCode;
    public TextField txtHour;
    public Text error;


    public void onToList(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../listMonHoc/list_mon_hoc.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("danh sách môn học");
        Main.rootStage.setScene(listScene);
    }
    public void monhocSubmit(){
        try {
            int hours = Integer.parseInt(txtHour.getText());
            if(txtName.getText().isEmpty() || txtCode.getText().isEmpty()||txtHour.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên,code và giờ");
            }
            for (MonHoc m : assignment_mon_hoc.listMonHoc.Controller.list) {
                if (m.getCode().equals(txtCode.getText()))
                    throw  new Exception(" mã code không được trùng. Vui lòng nhập dữ liệu");
            }
            assignment_mon_hoc.listMonHoc.Controller.list.add(new MonHoc(txtName.getText(),txtCode.getText(),txtHour.getText()));
            onToList(null);
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
}
