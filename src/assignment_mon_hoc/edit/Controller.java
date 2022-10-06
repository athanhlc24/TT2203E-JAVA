package assignment_mon_hoc.edit;



import assignment_mon_hoc.Main;

import assignment_mon_hoc.addNewMonHoc.MonHoc;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtCode;
    public TextField txtHour;
    public Text error;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            if (assignment_mon_hoc.listMonHoc.Controller.editItems == null){
                onToList(null);
            }
            txtCode.setText(assignment_mon_hoc.listMonHoc.Controller.editItems.getName());
            txtCode.setText(assignment_mon_hoc.listMonHoc.Controller.editItems.getCode());
            txtCode.setText(assignment_mon_hoc.listMonHoc.Controller.editItems.getHour());
            txtCode.setEditable(false);

        }catch (Exception e){

        }

    }

    public void onToList(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../listMonHoc/list_mon_hoc.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("danh sách môn học");
        Main.rootStage.setScene(listScene);
    }

    public void submit(ActionEvent actionEvent){
        try {

            if(txtName.getText().isEmpty() ||txtHour.getText().isEmpty()){
                throw new Exception("Vui lòng nhập đầy đủ tên,code và giờ");
            }
            assignment_mon_hoc.listMonHoc.Controller.editItems.setName(txtName.getText());
            assignment_mon_hoc.listMonHoc.Controller.editItems.setHour(txtHour.getText());
            onToList(null);
        }catch (Exception e){
            error.setText(e.getMessage());
            error.setVisible(true);
        }
    }
}
