package sample.scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.util.List;


public class Controller {

    @FXML
    Label lbImagename;

    @FXML
    TableView tvActivity;

    @FXML
    ImageView ivSignature;

    @FXML
    Button btnNewOrderraport, btnNewCustomer, btnNewWorker, btnNewDate, btnNewTravelingCosts, btnRemoveActivity, btnNewActivity, btnSelectSignature;

    @FXML
    ComboBox cbTitle, cbCustomer, cbWorker, cdDate, cdTravelingCosts, cbRemoveActivity;

    @FXML
    TableColumn tcId, tcNote, tcCosts, tcTotalTime, tcFrom, tcTo, tcType;

    @FXML
    protected void btnNewOrderraportOA(ActionEvent event) {

        JTextField name = new JTextField();
        Object[] message = {"Title", name};

        JOptionPane pane = new JOptionPane( message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        pane.createDialog(null, "Orderraport Title").setVisible(true);

        if (valueSave() == 0){
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
            System.out.println("Eingabe: " + name.getText());
        }

    }

    @FXML
    protected void btnNewCustomerOA(ActionEvent event) {

        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();
        JTextField tel = new JTextField();
        JTextField email = new JTextField();

        final String labels[] = { "","A", "B", "C", "D", "E" };
        JComboBox CBcompany = new JComboBox(labels);
        JTextField TFcompany = new JTextField();

        JComboBox CBplace = new JComboBox();
        JTextField TFplace = new JTextField();

        JComboBox CBzip = new JComboBox();
        JTextField TFzip = new JTextField();

        JComboBox CBstreetName = new JComboBox();
        JTextField TFstreetName = new JTextField();

        JComboBox CBstreetNr = new JComboBox();
        JTextField TFstreetNr = new JTextField();


        Object[] message = {
                "Firstname", firstname,
                "Lastname", lastname,
                "Tel", tel,
                "Email", email,
                "Company", CBcompany, TFcompany,
                "Place", CBplace, TFplace,
                "ZIP", CBzip, TFzip,
                "Streetname", CBstreetName, TFstreetName,
                "StreetNr", CBstreetNr, TFstreetNr};

        JOptionPane pane = new JOptionPane( message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        pane.createDialog(null, "Customer").setVisible(true);

        if (valueSave() == 0){
            System.out.print(CBcompany.getSelectedItem());
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        }
    }

    @FXML
    protected void btnNewWorkerOA(ActionEvent event) {

        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();

        Object[] message = {
                "Firstname", firstname,
                "Lastname", lastname};

        JOptionPane pane = new JOptionPane( message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        pane.createDialog(null, "Worker").setVisible(true);

        if (valueSave() == 0){
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        }
    }

    @FXML
    protected void btnNewDateOA(ActionEvent event) {

        JTextField day = new JTextField();
        JTextField month = new JTextField();
        JTextField year = new JTextField();

        Object[] message = {
                "Day", day,
                "Month", month,
                "Year", year};

        JOptionPane pane = new JOptionPane( message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        pane.createDialog(null, "Date").setVisible(true);

        if (valueSave() == 0){
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        }
    }

    @FXML
    protected void btnNewTravelingCostsOA(ActionEvent event) {
        JTextField km = new JTextField();

        Object[] message = {
                "km", km};

        JOptionPane pane = new JOptionPane( message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION);

        pane.createDialog(null, "Traveling distance in km").setVisible(true);

        if (valueSave() == 0){
            //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++//
        }
    }

    @FXML
    protected void btnRemoveActivityOA(ActionEvent event) {

    }

    @FXML
    protected void btnNewActivityOA(ActionEvent event) {

    }

    @FXML
    protected void btnSelectSignatureOA(ActionEvent event) {
         /*
        InsertImageTest DBHelper = new InsertImageTest();
        BufferedInputStream Bild = DBHelper.readeImage("select * from bildtest where id = 1", "Bild");
        Image img = new Image(Bild);
        IVBild.setImage(img);
        */
    }

    @FXML
    public void initialize(){

    }

    public int valueSave(){

        Object[] options = {"OK", "Cancel"};

        int insert = JOptionPane.showOptionDialog(null,
                "Save?",
                "",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0]);
        return  insert;
    }
}
