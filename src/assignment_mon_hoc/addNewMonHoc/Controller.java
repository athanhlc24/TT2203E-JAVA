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

            if(txtName.getText().isEmpty() || txtCode.getText().isEmpty()||txtHour.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên,code và giờ");
            }

        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
}
