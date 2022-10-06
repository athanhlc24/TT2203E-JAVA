package assignment_mon_hoc.listMonHoc;

import assignment_mon_hoc.Main;
import assignment_mon_hoc.addNewMonHoc.MonHoc;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public ListView<MonHoc> lvListMonHoc;

    public static ObservableList<MonHoc> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lvListMonHoc.setItems(list);
    }

    public void onToForm(ActionEvent actionEvent) throws  Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../addNewMonHoc/add_new_mon_hoc.fxml"));
        Scene listScene = new Scene(listPage,800,600);


        Main.rootStage.setTitle("Thêm môn học");
        Main.rootStage.setScene(listScene);

    }
}
