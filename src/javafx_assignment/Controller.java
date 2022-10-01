package javafx_assignment;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtFullName;
    public TextField txtEmail;
    public TextField txtAge;
    public TextField txtAddress;
    public Text tFullName;
    public Text tEmail;
    public Text tAge;
    public Text tAddress;
    public void handleSubmit(){
        String fn = txtFullName.getText();
        tFullName.setText(fn);

        String em = txtEmail.getText();
        tEmail.setText(em);

        String ag = txtAge.getText();
        tAge.setText(ag);

        String ad = txtAddress.getText();
        tAddress.setText(ad);
    }

}
