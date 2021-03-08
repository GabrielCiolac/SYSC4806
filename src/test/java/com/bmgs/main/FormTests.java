package com.bmgs.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FormTests {

    @Test
    public void testGetTitle(){
        Form form = new Form("Questionnaire");
        assertEquals("Questionnaire",form.getTitle());
    }

    @Test
    public void testSetTitle(){
        Form form = new Form();
        form.setTitle("Questionnaire");
        assertEquals("Questionnaire",form.getTitle());

    }

    @Test
    public void testAddQuestion(){
        Form form = new Form();
        form.addQuestion(new OpenEndedQuestion("What does summer mean to you?"));
        assertEquals(1,form.getQuestionList().size());

    }

    @Test
    public void testRemoveQuestion(){
        Form form = new Form();
        form.addQuestion(new OpenEndedQuestion("What does winter mean to you?"));
        form.addQuestion(new OpenEndedQuestion("What does summer mean to you?"));
        form.addQuestion(new OpenEndedQuestion("What does fall mean to you?"));
        form.removeQuestion(0);
        assertEquals(2,form.getQuestionList().size());
    }

    @Test
    public void testGetQuestion(){
        Form form = new Form();
        form.addQuestion(new OpenEndedQuestion("test"));
        form.addQuestion(new OpenEndedQuestion("What does summer mean to you?"));
        form.addQuestion(new OpenEndedQuestion("What does fall mean to you?"));
        assertEquals("OpenEndedQuestion{question='test'}",form.getQuestion(0).toString());
    }

    @Test
    public void testToString(){
        Form form = new Form();
        form.setTitle("TestTest");
        form.addQuestion(new OpenEndedQuestion("test"));
        assertEquals("TestTest\n" + "OpenEndedQuestion{question='test'}\n",form.toString());
    }
}
