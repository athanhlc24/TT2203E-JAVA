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

    public Text noticeName;
    public Text noticeEmail;
    public Text noticeAge;
    public Text noticeAddress;
    public void handleSubmit(){
        String fn = txtFullName.getText();
        if (fn.isEmpty()){
            noticeName.setText("Vui lòng nhập họ tên: ");
            noticeName.setVisible(true);
        }else {

            tFullName.setText(fn);
            noticeName.setVisible(false);
        }



        String em = txtEmail.getText();
        if (em.isEmpty() || !em.contains("@") || em.startsWith("@")||em.endsWith("@")){
            noticeEmail.setText("Vui lòng nhập vào một email");
            noticeEmail.setVisible(true);
        }else {
            noticeEmail.setVisible(false);
            tEmail.setText(em);
        }


        String ag = txtAge.getText();
        try {
            Integer nAge = Integer.parseInt(ag);
            if (nAge<0||nAge>100)
                throw new Exception("Vui lòng nhập tuổi hợp lệ");
            tAge.setText(ag);
            noticeAge.setVisible(false);
        }catch (Exception e){
            noticeAge.setText(e.getMessage());
            noticeAge.setVisible(true);
        }

        String ad = txtAddress.getText();
        if(ad.isEmpty() || ad.length() < 10){
            noticeAddress.setText("Vui lòng nhập vào một địa chỉ phải có hơn 10 kí tự");
            noticeAddress.setVisible(true);
        }else{
            noticeAddress.setVisible(false);
            tAddress.setText(ad);
        }
    }

}
