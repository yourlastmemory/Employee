package controller.product;

import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Pair;
import model.CandidateWorksheet;
import model.Technology;
import model.Worksheet;

import javax.xml.stream.events.Characters;

public class CandidateRegisterController{
    private static CandidateWorksheet editing=null;

    public static CandidateWorksheet getEditing() {
        return editing;
    }

    public static void setEditing(CandidateWorksheet editing) {
        CandidateRegisterController.editing = editing;
    }

    @FXML
    private TextField tfName;

    @FXML
    private DatePicker dpBirth;

    @FXML
    private CheckBox checkTransport;

    @FXML
    private Spinner<Integer> spExperience;

    @FXML
    private Spinner<Integer> spTechExperience;

    @FXML
    private CheckBox checkCredits;

    @FXML
    private CheckBox checkFamily;

    @FXML
    private ToggleGroup tgGender;

    @FXML
    private Spinner<Integer> spCommunicability;

    @FXML
    private Spinner<Integer> spPunctuality;

    @FXML
    private Spinner<Integer> spResponsibility;

    @FXML
    private Spinner<Integer> spLearning;

    @FXML
    private Spinner<Integer> spStressResistance;

    @FXML
    private Spinner<Integer> spAttention;

    @FXML
    private Spinner<Integer> spDiscipline;

    @FXML
    private Spinner<Integer> spTeamWork;

    @FXML
    private Spinner<Integer> spSelfConfidence;

    @FXML
    private Spinner<Integer> spInitiative;

    @FXML
    private ListView<String> lvCountry;

    @FXML
    private TextField tfCountry;

    @FXML
    private ListView<Pair<String,String>> lvLanguages;

    @FXML
    private TextField tfLanguage;

    @FXML
    private ChoiceBox<String> cbLanguageLevel;

    @FXML
    private TextField tfTechnologyName;

    @FXML
    private ChoiceBox<String> cbTechnologyLevel;

    @FXML
    private ListView<Technology> lvTechnologies;

    @FXML
    void btnAddCountry(ActionEvent event) {
        if (tfCountry.getText().length()>0
                &&isTextOnly(tfCountry.getText())
                &&!lvCountry.getItems().contains(tfCountry.getText()))
            lvCountry.getItems().add(tfCountry.getText());
        Collections.sort(lvCountry.getItems());
    }

    private boolean isTextOnly(String text) {
        for(Character chr:text.toCharArray()
                ) {
            if (!Character.isAlphabetic(chr))
                return false;
        }
        return true;
    }

    @FXML
    void btnAddLanguage(ActionEvent event) {
        if (tfLanguage.getText().length()>0
                &&isTextOnly(tfLanguage.getText())
                &&cbLanguageLevel.getSelectionModel().getSelectedItem()!=null){
            Pair<String,String> lang=new Pair<>(tfLanguage.getText(),cbLanguageLevel.getValue());
            if (!lvLanguages.getItems().contains(lang))
                lvLanguages.getItems().add(lang);
    }

    }

    @FXML
    void btnAddTechnology(ActionEvent event) {

    }

    @FXML
    void btnRemoveCountry(ActionEvent event) {

    }

    @FXML
    void btnRemoveLanguage(ActionEvent event) {

    }

    @FXML
    void btnRemoveTechnology(ActionEvent event) {

    }

    @FXML
    void btnReset(ActionEvent event) {

    }

    @FXML
    void btnSave(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert tfName != null : "fx:id=\"tfName\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert dpBirth != null : "fx:id=\"dpBirth\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert checkTransport != null : "fx:id=\"checkTransport\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spExperience != null : "fx:id=\"spExperience\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spTechExperience != null : "fx:id=\"spTechExperience\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert checkCredits != null : "fx:id=\"checkCredits\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert checkFamily != null : "fx:id=\"checkFamily\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert tgGender != null : "fx:id=\"tgGender\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spCommunicability != null : "fx:id=\"spCommunicability\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spPunctuality != null : "fx:id=\"spPunctuality\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spResponsibility != null : "fx:id=\"spResponsibility\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spLearning != null : "fx:id=\"spLearning\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spStressResistance != null : "fx:id=\"spStressResistance\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spAttention != null : "fx:id=\"spAttention\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spDiscipline != null : "fx:id=\"spDiscipline\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spTeamWork != null : "fx:id=\"spTeamWork\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spSelfConfidence != null : "fx:id=\"spSelfConfidence\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert spInitiative != null : "fx:id=\"spInitiative\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert lvCountry != null : "fx:id=\"lvCountry\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert tfCountry != null : "fx:id=\"tfCountry\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert lvLanguages != null : "fx:id=\"lvLanguages\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert tfLanguage != null : "fx:id=\"tfLanguage\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert cbLanguageLevel != null : "fx:id=\"cbLanguageLevel\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert tfTechnologyName != null : "fx:id=\"tfTechnologyName\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert cbTechnologyLevel != null : "fx:id=\"cbTechnologyLevel\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        assert lvTechnologies != null : "fx:id=\"lvTechnologies\" was not injected: check your FXML file 'CandidateRegister.fxml'.";
        configureControls();
    }

    private void configureControls() {
        spTechExperience.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,40));
        spExperience.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,40));
        spAttention.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spCommunicability.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spDiscipline.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spInitiative.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spLearning.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spPunctuality.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spResponsibility.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spSelfConfidence.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spStressResistance.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        spTeamWork.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(1,10));
        cbLanguageLevel.setItems(Worksheet.getLanguageLevels());
        cbTechnologyLevel.setItems(Worksheet.getTechnologyUsageTypes());

    }

}
