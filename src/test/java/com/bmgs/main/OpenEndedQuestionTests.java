package com.bmgs.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OpenEndedQuestionTests{

    @Test
    public void testGetQuestion(){
        OpenEndedQuestion question = new OpenEndedQuestion("What is your favorite question?");
        assertEquals("What is your favorite question?",question.getQuestion());
    }

    @Test
    public void testSetQuestion(){
        OpenEndedQuestion question = new OpenEndedQuestion();
        question.setQuestion("Why is the sky blue?");
        assertEquals("Why is the sky blue?", question.getQuestion());
    }
    @Test
    public void testToString(){
        OpenEndedQuestion question = new OpenEndedQuestion();
        question.setId(1L);
        question.setQuestion("What is your least favorite color?");
        assertEquals("OpenEndedQuestion{id=1, question='What is your least favorite color?'}",question.toString());
    }
}
