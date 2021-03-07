package com.bmgs.main;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Form {

    @Id
    @GeneratedValue
    protected long id;

    //TODO Replace String to Question Type
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Question> questionList;

    public Form(){

        questionList = new LinkedList<Question>();

    }

    public Form(List<Question> questionList){
        this.questionList = questionList;
    }

    /**
     * Adds question to the question list.
     * @param question
     */
    public void addQuestion(Question question){
        questionList.add(question);
    }

    /**
     * Removing question from question list.
     * @param i index of the list
     */
    public void removeQuestion(int i){
        if(i >= 0 && i < questionList.size()){
            questionList.remove(i);
        }
    }

    /**
     * Get question from question list.
     */
    public Question getQuestion(int i){
        if(i >= 0 && i < questionList.size()){
            return questionList.get(i);
        }
        return null;
    }

    /**
     * Clear all questions from the question list.
     */
    public void clearQuestion(){
        questionList.clear();
    }

    /**
     * Get question list.
     * @return
     */
    public List<Question> getQuestionList(){
        return this.questionList;
    }

    /**
     * Set question list.
     * @param questionList
     */
    public void setQuestionList(List<Question> questionList){
        this.questionList = questionList;
    }

}
