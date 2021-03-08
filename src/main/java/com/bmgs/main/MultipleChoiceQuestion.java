package com.bmgs.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.LinkedList;
import java.util.List;

@Entity
public class MultipleChoiceQuestion extends Question<String>{

    @Id
    @GeneratedValue
    private Long id;

    private String question;

    private List<Option> optionList;

    public MultipleChoiceQuestion(){
        super();
        question = "";
        optionList = new LinkedList<Option>();
    }

    public MultipleChoiceQuestion(String question){
        super();
        this.question = question;
        optionList = new LinkedList<Option>();
    }

    public MultipleChoiceQuestion(String question, LinkedList<Option> optionList){
        super();
        this.question = question;
        this.optionList = optionList;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getQuestion() {
        return this.question;
    }

    @Override
    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Option> getOptionList(){
        return this.optionList;
    }

    public void setOptionList(List<Option> optionList){
        this.optionList = optionList;
    }

    public void addOption(Option option){
        this.optionList.add(option);
    }

    public Option getOption(int i){
        if(i >= 0 && i < optionList.size()){
            return optionList.get(i);
        }
        return null;
    }

    public void deleteOption(int i){
        if(i >= 0 && i < optionList.size()){
            optionList.remove(i);
        }
    }

    public void clearOption(){
        optionList.clear();
    }

    @Override
    public String toString() {

        String s = "";
        for(int i = 0; i < optionList.size();i++){
            s += optionList.get(i) + " ";
        }

        return "MultipleChoiceQuestion{" +
                "question='" + question + '\'' +
                ", optionList=" + s + '}';
    }
}
