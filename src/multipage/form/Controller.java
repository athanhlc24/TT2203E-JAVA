package multipage.form;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import multipage.Main;

public class Controller {
    public void onToList(ActionEvent actionEvent) throws Exception{
        Parent formPage = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene formScene = new Scene(formPage,800,600);


        Main.rootStage.setTitle("List");
        Main.rootStage.setScene(formScene);
    }
}
