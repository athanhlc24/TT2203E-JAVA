package student_assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Collections;
import java.util.Comparator;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;
    public Text error;
    public ListView<Students> lvStudent;

    private boolean sortName = true;

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

}
