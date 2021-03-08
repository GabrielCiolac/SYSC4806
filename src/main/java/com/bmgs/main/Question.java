package com.bmgs.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Question<T>{
    @Id
    @GeneratedValue
    protected Long id;
    public Question(){

    }
    public Question(Long id){
        this.id = id;
    }
    public abstract Long getId();
    public abstract T getQuestion();
    public abstract void setQuestion(T question);

}
