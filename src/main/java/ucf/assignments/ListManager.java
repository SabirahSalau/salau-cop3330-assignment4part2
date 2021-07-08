/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sabirah Salau
 */


package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListManager
{
    @FXML
    public void renameListClicked(ActionEvent actionEvent) {
        renameList();
    }

    public void renameList(){
        //Select list to be renamed
        //Rename list
        //Display new list name
    }

    @FXML
    public void deleteListClicked(ActionEvent actionEvent) {
        deleteList();
    }
    public void deleteList(){
        //Select list to be deleted
        //Remove list
        //Display adjusted lists view
    }

    @FXML
    public void addListClicked(ActionEvent actionEvent) {
        addList();
    }
    public void addList(){
        //Create new list
        //Require title input
        //Display lists
    }

    @FXML
    public void saveListClicked(ActionEvent actionEvent) {
        saveList();
    }
    public void saveList(){
        //Check marked list
        //Write list to file
    }

    @FXML
    public void saveAllClicked(ActionEvent actionEvent) {
        saveAll();
    }
    public void saveAll(){
        //Write all lists to file.
    }

    @FXML
    public void addItemClicked(ActionEvent actionEvent) {
        addItem();
    }
    public void addItem(){
        //Create new item
        //Require item name
        //Require item description
        //Require due date input
    }

    @FXML
    public void deleteItemClicked(ActionEvent actionEvent) {
        deleteItem();
    }
    public void deleteItem(){
        //Select item to be deleted and remove.
    }

    public void isComplete() {
        //return true or false depending on the value
    }

    public void editItem(){
        //Select item to be edited
        //Change description and due date
    }
}
