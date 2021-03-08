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

    }

    public Option(String text){
        this.text = text;
    }



    public void setId(Long id) {
        this.id = id;
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
}
