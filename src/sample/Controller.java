// Made by: Kevin Chen, 23365285

package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controller {
    ObservableList<Contacts> List = FXCollections.observableArrayList();
    ObservableList<String> ListLastNames = FXCollections.observableArrayList();
    ObservableList<String> ListFirstNames = FXCollections.observableArrayList();
    ObservableList<String> ListLastFirst = FXCollections.observableArrayList();
    ObservableList<String> ListEmail = FXCollections.observableArrayList();
    ObservableList<String> ListPhone = FXCollections.observableArrayList();

    @FXML
    private TextField Email;

    @FXML
    private TextField FirstName;

    @FXML
    private TextField Phone;

    @FXML
    private ListView<String> ContactNames;

    @FXML
    private Button AddContact;

    @FXML
    private Button Update;

    @FXML
    private Button Delete;

    @FXML
    private Button Swap;

    @FXML
    private Button Sort;

    @FXML
    private GridPane InfoGrid;

    @FXML
    private TextField LastName;

    @FXML
    private void initialize(){
        String NewLastName = "New Contacts";
        String NewFirstName = "";
        String NewEmail = "";
        String NewPhone = "";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        Image NewC  = new Image("https://upload.wikimedia.org/wikipedia/commons/b/b7/Google_Contacts_logo.png",30,30,false,false);
        Image[] listOfImages = {NewC};
        NewLastName = "Chen";
        NewFirstName = "Kevin";
        NewEmail = "kchen008@citymail.cuny.edu";
        NewPhone = "9170123456";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Doe";
        NewFirstName = "John";
        NewEmail = "Jdoe000@citymail.cuny.edu";
        NewPhone = "1234567890";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Smith";
        NewFirstName = "William";
        NewEmail = "WSmith001@citymail.cuny.edu";
        NewPhone = "7180001111";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Tester";
        NewFirstName = "Beta";
        NewEmail = "BTester002@citymail.cuny.edu";
        NewPhone = "6460011223";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Tester";
        NewFirstName = "Alpha";
        NewEmail = "ATester003@citymail.cuny.edu";
        NewPhone = "6463445566";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Gondiker";
        NewFirstName = "Kanchan";
        NewEmail = "kgondik000@citymail.cuny.edu";
        NewPhone = "6466531234";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Lee";
        NewFirstName = "Bob";
        NewEmail = "Blee004@citymail.cuny.edu";
        NewPhone = "7182430854";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Lin";
        NewFirstName = "Yan";
        NewEmail = "Ylin005@citymail.cuny.edu";
        NewPhone = "6469230539";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Nee";
        NewFirstName = "Jinx";
        NewEmail = "Jnee006@citymail.cuny.edu";
        NewPhone = "3245432456";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Cyrus";
        NewFirstName = "Miley";
        NewEmail = "Mcyrus007@citymail.cuny.edu";
        NewPhone = "5390012432";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        NewLastName = "Kardashian";
        NewFirstName = "Kim";
        NewEmail = "Kkardashian008@citymail.cuny.edu";
        NewPhone = "6624000245";
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        List.add(new Contacts(NewLastName, NewFirstName, NewEmail, NewPhone));
        ContactNames.setItems(ListLastNames);
        ContactNames.setCellFactory(listView -> new ListCell<String>() {
            private ImageView imageview = new ImageView();
            @Override
            public void updateItem(String contactnames, boolean empty){
                super.updateItem(contactnames, empty);
                if (empty){
                   setText(null);
                   setGraphic(null);
                }
                else{
                    Image image = listOfImages[0];
                    imageview.setImage(image);
                    setText(contactnames);
                    setGraphic(imageview);
                }
            }
        }
        );
        ContactNames.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        System.out.println("Selected Item: " + t1);
                        System.out.println("At Index: " + ContactNames.getSelectionModel().getSelectedIndex());
                        System.out.println("Total Size: " + List.size());
                    }
                }
        );

    }

    @FXML
    void DisplaySelected(MouseEvent event) {
        int Index = ContactNames.getSelectionModel().getSelectedIndex();
        String NewContacts = "New Contacts";
        if (ListLastNames.get(Index) == NewContacts){
            FirstName.clear();
            LastName.clear();
            Email.clear();
            Phone.clear();
        }
        else{
            FirstName.setText(ListFirstNames.get(Index));
            LastName.setText(ListLastNames.get(Index));
            Email.setText(ListEmail.get(Index));
            Phone.setText(ListPhone.get(Index));
        }
    }

    @FXML
    void CalculateUpdate(ActionEvent event) {
        int Index = ContactNames.getSelectionModel().getSelectedIndex();
        String NewLastName = LastName.getText();
        String NewFirstName = FirstName.getText();
        String NewEmail = Email.getText();
        String NewPhone = Phone.getText();
        String NewLastFirst = NewLastName + " " + NewFirstName;
        Contacts contacts = new Contacts(NewLastName,NewFirstName,NewEmail,NewPhone);
        int Changed = 0;
        if (ListLastNames.get(Index) != NewLastName){
            ListLastNames.set(Index,NewLastName);
            Changed = 1;
        }
        if (ListFirstNames.get(Index) != NewFirstName){
            ListFirstNames.set(Index,NewFirstName);
            Changed = 1;
        }
        if(ListEmail.get(Index) != NewEmail){
            ListEmail.set(Index,NewEmail);
            Changed = 1;
        }
        if (ListPhone.get(Index) != NewPhone){
            ListPhone.set(Index,NewPhone);
            Changed = 1;
        }
        if (Changed == 1){
            List.set(Index,contacts);
            ListLastFirst.set(Index,NewLastFirst);
        }
    }
    @FXML
    void SwapPressed(ActionEvent event) {
        if(ContactNames.getItems() == ListLastNames){
            ContactNames.setItems(ListLastFirst);
        }
        else{
            ContactNames.setItems(ListLastNames);
        }
    }

    @FXML
    void SortPressed(ActionEvent event) {
        for (int i = 1; i < List.size(); i++){
            String Min =  ListLastNames.get(i);
            int MinPos = i;
            for (int j = i; j < List.size(); j++){
                int result = ListLastNames.get(j).compareTo(Min);
                if(result < 0){
                    Min = ListLastNames.get(j);
                    MinPos = j;
                }
            }
            String Temp = ListLastNames.get(MinPos);
            ListLastNames.set(MinPos,ListLastNames.get(i));
            ListLastNames.set(i,Temp);

            Temp = ListFirstNames.get(MinPos);
            ListFirstNames.set(MinPos,ListFirstNames.get(i));
            ListFirstNames.set(i,Temp);

            Temp = ListEmail.get(MinPos);
            ListEmail.set(MinPos,ListEmail.get(i));
            ListEmail.set(i,Temp);

            Temp = ListPhone.get(MinPos);
            ListPhone.set(MinPos,ListPhone.get(i));
            ListPhone.set(i,Temp);

            Temp = ListLastFirst.get(MinPos);
            ListLastFirst.set(MinPos,ListLastFirst.get(i));
            ListLastFirst.set(i,Temp);

            Contacts Temps = List.get(MinPos);
            List.set(MinPos,List.get(i));
            List.set(i,Temps);
        }
    }

    @FXML
    void CalculateDelete(ActionEvent event) {
        int Index = ContactNames.getSelectionModel().getSelectedIndex();
        List.remove(Index);
        ListLastNames.remove(Index);
        ListFirstNames.remove(Index);
        ListEmail.remove(Index);
        ListPhone.remove(Index);
        ListLastFirst.remove(Index);
        FirstName.clear();
        LastName.clear();
        Email.clear();
        Phone.clear();
    }

    @FXML
    void CalculateButtonPressed(ActionEvent event) {
        String NewFirstName = FirstName.getText();
        String NewLastName = LastName.getText();
        String NewEmail = Email.getText();
        String NewPhone = Phone.getText();
        Contacts newContact = new Contacts(NewFirstName,NewFirstName,NewEmail,NewPhone);
        List.add(newContact);
        ListLastNames.add(NewLastName);
        ListFirstNames.add(NewFirstName);
        ListEmail.add(NewEmail);
        ListPhone.add(NewPhone);
        ListLastFirst.add(NewLastName + " " + NewFirstName);
        FirstName.clear();
        LastName.clear();
        Email.clear();
        Phone.clear();

    }
}
