package com.bmgs.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OpenEndedQuestion extends Question<String>{

    @Id
    @GeneratedValue
    protected Long id;

    private String question;

    public OpenEndedQuestion(){
        super();
        this.question = "";
    }

    public OpenEndedQuestion(String question){
        super();
        this.question = question;
    }

    /**
     * This function gets the open-ended question id.
     * @return
     */
    @Override
    public Long getId() {
        return this.id;
    }


    /**
     * This function gets the open-ended question.
     * @return
     */
    @Override
    public String getQuestion() {
        return this.question;
    }

    /**
     * This function sets open-ended question.
     * @param question
     */
    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "OpenEndedQuestion{" +
                "question='" + question + '\'' +
                '}';
    }
}
