package assignment_mon_hoc.listMonHoc;

import assignment_mon_hoc.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
    public void onToForm(ActionEvent actionEvent) throws  Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../addNewMonHoc/add_new_mon_hoc.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);

    }
}
