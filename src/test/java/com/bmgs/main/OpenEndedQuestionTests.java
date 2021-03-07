package com.bmgs.main;

import junit.framework.TestCase;

public class OpenEndedQuestionTests extends TestCase {

    public void testGetQuestion(){
        OpenEndedQuestion question = new OpenEndedQuestion("What is your favorite question?");
        assertEquals("What is your favorite question?",question.getQuestion());
    }

    public void testSetQuestion(){
        OpenEndedQuestion question = new OpenEndedQuestion();
        question.setQuestion("Why is the sky blue?");
        assertEquals("Why is the sky blue?", question.getQuestion());
    }

    public void testToString(){
        OpenEndedQuestion question = new OpenEndedQuestion();
        question.setId(1L);
        question.setQuestion("What is your least favorite color?");
        assertEquals("OpenEndedQuestion{id=1, question='What is your least favorite color?'}",question.toString());
    }
}
