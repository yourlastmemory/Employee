package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class Worksheet {
    private String name;
    private String gender;
    private Map<String,Integer> personalQualitiesMap=new HashMap<>();
    private Map<String,Integer> languagesMap=new HashMap<>();
    private Map<String,Boolean> mobilityFactorsMap=new HashMap<>();
    private ArrayList<Technology> technologiesList=new ArrayList<>();
    private ArrayList<Technology> visasList=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<String, Integer> getPersonalQualitiesMap() {
        return personalQualitiesMap;
    }

    public void setPersonalQualitiesMap(Map<String, Integer> personalQualitiesMap) {
        this.personalQualitiesMap = personalQualitiesMap;
    }

    public Map<String, Integer> getLanguagesMap() {
        return languagesMap;
    }

    public void setLanguagesMap(Map<String, Integer> languagesMap) {
        this.languagesMap = languagesMap;
    }

    public Map<String, Boolean> getMobilityFactorsMap() {
        return mobilityFactorsMap;
    }

    public void setMobilityFactorsMap(Map<String, Boolean> mobilityFactorsMap) {
        this.mobilityFactorsMap = mobilityFactorsMap;
    }

    public ArrayList<Technology> getTechnologiesList() {
        return technologiesList;
    }

    public void setTechnologiesList(ArrayList<Technology> technologiesList) {
        this.technologiesList = technologiesList;
    }

    public ArrayList<Technology> getVisasList() {
        return visasList;
    }

    public void setVisasList(ArrayList<Technology> visasList) {
        this.visasList = visasList;
    }

    public static ObservableList<String> getLanguageLevels() {
        return languageLevels;
    }


    private static final ObservableList<String> languageLevels=
            FXCollections.observableArrayList("A1","A2","B1","B2","C1","C2");

    public static ObservableList<String> getTechnologyUsageTypes() {
        return technologyUsageTypes;
    }

    private static final ObservableList<String> technologyUsageTypes=
            FXCollections.observableArrayList(
                    "Коммерческое применение","Лабораторные работы","Курсовые и дипломные проекты");

}
