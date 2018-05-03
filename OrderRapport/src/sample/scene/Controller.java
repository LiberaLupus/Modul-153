package sample.scene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import sample.helper.DBManager;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Controller {

    public Controller(){
        int IdOrderRapport;
    }

    @FXML
    Label lbImagename;

    @FXML
    TableView tvActivity;

    @FXML
    ImageView ivSignature;

    @FXML
    Button  btnNewOrderraport, btnRemoveOrderraport,
            btnNewCustomer, btnRemoveCustomer,
            btnNewWorker, btnRemoveWorker,
            btnNewDate, btnRemoveDate,
            btnNewTravelingCosts, btnRemoveTravelingCosts,
            btnNewActivity, btnRemoveActivity,
            btnSelectSignature,
            btnSaveOrderrapport;

    @FXML
    ComboBox cbTitle, cbCustomer, cbWorker, cdDate, cdTravelingCosts, cbRemoveActivity;

    @FXML
    TableColumn tcId, tcNote, tcCosts, tcTotalTime, tcFrom, tcTo, tcType;

    public Map<String, String> OrderRapport = new HashMap<String, String>();

    @FXML
    protected void btnNewOrderraportOA(ActionEvent event) {

        JTextField title = new JTextField();
        Object[] message = {"Title", title};

        JOptionPane pane = new JOptionPane( message,
                JOptionPane.PLAIN_MESSAGE,
                JOptionPane.DEFAULT_OPTION);
        pane.createDialog(null, "Orderraport Title").setVisible(true);

        if (valueSave() == 0){
            cbTitle.getItems().add(title.getText());
            OrderRapport.put("Title", title.getText());
            cbTitle.setValue(title.getText());
        }

    }

    @FXML
    protected void btnRemoveOrderraportOA(ActionEvent event) {

    }



    @FXML
    protected void btnNewCustomerOA(ActionEvent event) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        DBManager DBHelper = new DBManager();

        JTextField firstname = new JTextField();
        JTextField lastname = new JTextField();
        JTextField tel = new JTextField();
        JTextField email = new JTextField();

        final String labels[] = DBHelper.Select02("SELECT * FROM companies;", "company").toArray(new String[0]);
        JComboBox CBcompany = new JComboBox(labels);
        CBcompany.setSelectedItem("");
        JTextField TFcompany = new JTextField();

        JComboBox CBplace = new JComboBox();
        CBplace.setSelectedItem("");
        JTextField TFplace = new JTextField();

        JComboBox CBzip = new JComboBox();
        CBzip.setSelectedItem("");
        JTextField TFzip = new JTextField();

        JComboBox CBstreetName = new JComboBox();
        CBstreetName.setSelectedItem("");
        JTextField TFstreetName = new JTextField();

        JComboBox CBstreetNr = new JComboBox();
        CBstreetNr.setSelectedItem("");
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

            cbCustomer.getItems().add(firstname.getText()+ " " + lastname.getText());
            cbCustomer.setValue(firstname.getText()+ " " + lastname.getText());

            OrderRapport.put("Firstname", firstname.getText());
            OrderRapport.put("Lastname", lastname.getText());
            OrderRapport.put("Tel", tel.getText());
            OrderRapport.put("Email", email.getText());

            if(String.valueOf(CBcompany.getSelectedItem()) == ""){
               OrderRapport.put("Company", TFcompany.getText());
            }else {
               OrderRapport.put("Company", String.valueOf(CBcompany.getSelectedItem()));
            }

            if(String.valueOf(CBcompany.getSelectedItem()) == ""){
                OrderRapport.put("Place", TFplace.getText());
            }else {
                OrderRapport.put("Place", String.valueOf(CBplace.getSelectedItem()));
            }

            if(String.valueOf(CBcompany.getSelectedItem()) == ""){
                OrderRapport.put("ZIP", TFzip.getText());
            }else {
                OrderRapport.put("ZIP", String.valueOf(CBzip.getSelectedItem()));
            }

            if(String.valueOf(CBcompany.getSelectedItem()) == ""){
                OrderRapport.put("Streetname", TFstreetName.getText());
            }else {
                OrderRapport.put("Streetname", String.valueOf(CBstreetName.getSelectedItem()));
            }

            if(String.valueOf(CBcompany.getSelectedItem()) == ""){
                OrderRapport.put("StreetNr", TFstreetNr.getText());
            }else {
                OrderRapport.put("StreetNr", String.valueOf(CBstreetNr.getSelectedItem()));
            }
        }
    }

    @FXML
    protected void btnRemoveCustomerOA(ActionEvent event){

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
    protected void btnRemoveWorkerOA(ActionEvent event){

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
    protected void btnRemoveDateOA(ActionEvent event){

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
    protected void btnRemoveTravelingCostsOA(ActionEvent event){

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
    protected void btnSaveOrderrapportOA(ActionEvent event) {

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
