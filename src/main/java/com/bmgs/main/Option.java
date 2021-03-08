package com.bmgs.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Option {
    @Id
    @GeneratedValue
    protected Long id;
    private String text;
    private Boolean isSelected;

    public Option() {
        this.text = "";
    }

    public Option(String text){
        this.text = text;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {this.text = text;}

    @Override
    public String toString() {
        return "Option{" +
                "text='" + text + '\'' +
                ", isSelected=" + isSelected +
                '}';
    }
}
