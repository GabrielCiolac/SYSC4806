package com.bmgs.main;

import junit.framework.TestCase;

public class RatingScaleQuestionTests extends TestCase {

    public void testGetQuestion(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.");
        assertEquals("How likely are you going to drop out of school.",question.getQuestion());

    }

    public void testSetQuestion(){
        RatingScaleQuestion question = new RatingScaleQuestion();
        question.setQuestion("How important is sleeping to you?");
        assertEquals("How important is sleeping to you?",question.getQuestion());
    }

    public void testGetMin(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.",0,7);
        assertEquals(0,question.getMin());
    }

    public void testSetMin(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.");
        question.setMin(0);
        assertEquals(0, question.getMin());

    }

    public void testGetMax(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.",0,7);
        assertEquals(7,question.getMax());
    }

    public void testSetMax(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.");
        question.setMax(7);
        assertEquals(7, question.getMax());
    }

    public void testToString(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.",0,7);
        question.setId(1L);
        assertEquals("RatingScaleQuestion{id=1, question='How likely are you going to drop out of school.', min=0, max=7}",question.toString());
    }
}
