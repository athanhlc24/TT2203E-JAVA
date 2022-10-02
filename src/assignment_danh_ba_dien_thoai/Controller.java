package assignment_danh_ba_dien_thoai;

import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    public TextField txtName;
    public TextField txtSDT;

    public Text tName;
    public Text tSDT;

    public Text notName;
    public Text notSDT;

    public void danhbaSubmit(){
        String name = txtName.getText();
        if (name.isEmpty()){
            notName.setText("Vui lòng nhập tên");
            notName.setVisible(true);
        }else {
            tName.setText(name);
            notName.setVisible(false);

        }

        String sdt = txtSDT.getText();

        try {
            Integer nsdt = Integer.parseInt(sdt);
            if (nsdt<10||nsdt>1000000000)
                throw new Exception("Vui lòng nhập số điện thoại phải là 10 số");
            tSDT.setText(sdt);
            notSDT.setVisible(false);
        }catch (Exception e){
            notSDT.setText(e.getMessage());
            notSDT.setVisible(true);
        }

    }
}
