/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Sabirah Salau
 */

package ucf.assignments;

import javafx.scene.control.CheckBox;

import java.time.LocalDate;

public class Item {

    private String description;
    private LocalDate date;



    public Item(String description, LocalDate date) {
        this.description = description;
        this.date = date;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
