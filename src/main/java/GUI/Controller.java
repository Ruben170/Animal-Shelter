package GUI;

import Classes.Reservation;
import Animals.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Serializer.*;

import javax.swing.plaf.basic.BasicListUI;
import java.net.URL;
import java.util.Observer;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public ListView lstAnimals;
    public TextField tbReserveName;
    public Reservation reservation = new Reservation();
    public Serializer serializer = new Serializer();
    public LoadSerialized load = new LoadSerialized();
    public TextField tbNewName;
    public TextField tbBadHabits;
    public ChoiceBox ddSpecies;
    public ChoiceBox ddGender;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        DataHandler data = new DataHandler(this);
//        Observers.add(data);
        ddSpecies.getItems().setAll(Species.values());
        ddGender.getItems().setAll(Gender.values());
        reservation.setAnimals(load.LoadAnimals());
        lstAnimals.getItems().setAll(load.LoadAnimals());
    }


    public void Add_Animal_Click(ActionEvent actionEvent) {

        String strSpecies = String.valueOf(ddSpecies.getValue());
        String strGender = String.valueOf(ddGender.getValue());
        String Name = String.valueOf(tbNewName.getCharacters());
        String BadHabits = String.valueOf(tbBadHabits.getCharacters());

        Gender gender = (Gender) String_to_gender(strGender);

        if (strSpecies == "Cat" & String_to_gender(strGender) != null & !Name.isEmpty() & !Name.isBlank()) {

            reservation.newCat(Name, gender, BadHabits);
            serializer.Serialize(reservation.getAnimals());
            reloadAnimalList();

        } else if (strSpecies == "Dog" & String_to_gender(strGender) != null & !Name.isEmpty() & !Name.isBlank()) {
            reservation.newDog(Name, gender);
            serializer.Serialize(reservation.getAnimals());
            reloadAnimalList();


        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setContentText("Something went wrong please make sure all the fields have been entered");

            alert.showAndWait();
        }
    }

    public Enum<Gender> String_to_gender(String strGender) {
        Gender gender;
        if (strGender == "Male") {
            gender = Gender.Male;
            return gender;
        } else if (strGender == "Female") {
            gender = Gender.Female;
            return gender;
        } else {
            gender = null;
            return gender;
        }

    }

    public void Change_BadHabits_State(ActionEvent actionEvent) {
        if (ddSpecies.getValue() == Species.Cat) {
            tbBadHabits.setDisable(false);
        } else {
            tbBadHabits.setDisable(true);
        }
    }

    public void Reserve_Animal_Click(ActionEvent actionEvent) {
        Animal animal = (Animal) lstAnimals.getSelectionModel().getSelectedItem();

        if (animal != null) {
            String ReserveName = tbReserveName.getText();

            animal.Reserve(ReserveName);
            serializer.Serialize(reservation.getAnimals());
            //reloadAnimalList();
            lstAnimals.getItems().setAll(reservation.getAnimals());
        }
    }

    private void reloadAnimalList() {
        lstAnimals.getItems().setAll(load.LoadAnimals());
    }
}
