package com.bmgs.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class RatingScaleQuestion extends Question<String>{

    @Id
    @GeneratedValue
    private Long id;

    private String question;

    private int min;

    private int max;

    public RatingScaleQuestion(){
        super();
        this.question = "";
    }

    public RatingScaleQuestion(String question){
        super();
        this.question = question;
    }

    public RatingScaleQuestion(String question, int min, int max){
        super();
        this.question = question;
        this.min = min;
        this.max = max;
    }

    /**
     * This function gets the rating scale question id.
     * @return
     */
    @Override
    public Long getId() {
        return this.id;
    }

    /**
     * This function sets the rating scale question id.
     * @param id
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This function gets the rating scale question.
     * @return
     */
    @Override
    public String getQuestion() {
        return this.question;
    }

    /**
     * This function sets the rating scale question.
     * @param question
     */
    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * This function get the rating scale min.
     * @return
     */
    public int getMin() {
        return min;
    }

    /**
     * This function sets the rating scale min.
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * This function get the rating scale max.
     */
    public int getMax() {
        return max;
    }

    /**
     *  This function sets the rating scale min.
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "RatingScaleQuestion{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", min=" + min +
                ", max=" + max +
                '}';
    }
}
