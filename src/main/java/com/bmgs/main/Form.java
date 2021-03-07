package com.bmgs.main;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Form {

    @Id
    @GeneratedValue
    protected long id;

    String title;

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
     * Get the form ID.
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * Set form title.
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get form title.
     * @return title
     */
    public String getTitle() {
        return title;
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

    /**
     * String representation of the Form object.
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(title);
        str.append('\n');
        for (Question q: questionList) {
            str.append(q.toString());
            str.append('\n');
        }
        return str.toString();
    }

}
