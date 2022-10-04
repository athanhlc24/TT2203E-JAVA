package multipage.list;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import multipage.Main;

public class Controller {
    public void onToForm(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("../form/form.fxml"));
        Scene lisScene = new Scene(listPage,800,600);


        Main.rootStage.setTitle("thêm môn học");
        Main.rootStage.setScene(lisScene);
    }
}
