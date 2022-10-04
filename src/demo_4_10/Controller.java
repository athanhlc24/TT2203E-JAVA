package demo_4_10;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public Text error;
    public ListView<Students> lvStudent;

    private boolean sortName = true;
    private boolean sortMark = true;

    private ObservableList<Students> studentList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        studentList.add(new Students("Hà Hoàng Hưng","hunghh@gmail.com",1));
        studentList.add(new Students("Trần Văn Thành","thanhtv@gmail.com",3));
        lvStudent.setItems(studentList);
    }

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
    public void sortByName(){

        Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return sortName?o1.getName().compareTo(o2.getName()):o2.getName().compareTo(o1.getName());
            }
        });
        sortName = !sortName;
        lvStudent.refresh();
    }
    public void sortByMark(){

        Collections.sort(studentList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return sortMark?o1.getMark() - o2.getMark():o2.getMark()-o1.getMark();
            }
        });
        sortMark = !sortMark;
        lvStudent.refresh();
    }

}
