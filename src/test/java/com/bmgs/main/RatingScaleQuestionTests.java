package com.bmgs.main;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RatingScaleQuestionTests{

    @Test
    public void testGetQuestion(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.");
        assertEquals("How likely are you going to drop out of school.",question.getQuestion());

    }
    @Test
    public void testSetQuestion(){
        RatingScaleQuestion question = new RatingScaleQuestion();
        question.setQuestion("How important is sleeping to you?");
        assertEquals("How important is sleeping to you?",question.getQuestion());
    }
    @Test
    public void testGetMin(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.",0,7);
        assertEquals(0,question.getMin());
    }
    @Test
    public void testSetMin(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.");
        question.setMin(0);
        assertEquals(0, question.getMin());

    }
    @Test
    public void testGetMax(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.",0,7);
        assertEquals(7,question.getMax());
    }
    @Test
    public void testSetMax(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.");
        question.setMax(7);
        assertEquals(7, question.getMax());
    }
    @Test
    public void testToString(){
        RatingScaleQuestion question = new RatingScaleQuestion("How likely are you going to drop out of school.",0,7);
        assertEquals("RatingScaleQuestion{id=1, question='How likely are you going to drop out of school.', min=0, max=7}",question.toString());
    }
}
