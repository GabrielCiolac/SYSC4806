package com.bmgs.main;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultipleChoiceQuestionTests{


    @Test
    public void testGetQuestion() throws Exception{
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("Which of the following is true?");

        assertEquals("Which of the following is true?", question.getQuestion());
    }

    @Test
    public void testSetQuestion(){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion();
        question.setQuestion("What colour is the sky?");
        assertEquals("What colour is the sky?", question.getQuestion());

    }

    @Test
    public void testAddOption(){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("How many days are in January?");
        question.addOption("31");
        question.addOption("28");
        question.addOption("56");
        assertEquals(3,question.getOptionList().size());
    }

    @Test
    public void testGetOption(){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("How many days are in January?");
        question.addOption("31");
        question.addOption("28");
        question.addOption("56");
        assertEquals("28",question.getOption(1));
    }

    @Test
    public void testDeleteOption(){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("How many days are in January?");
        question.addOption("31");
        question.addOption("28");
        question.addOption("56");
        question.deleteOption(2);
        assertEquals(2,question.getOptionList().size());
    }

    @Test
    public void testClearOption(){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("How many days are in January?");
        question.addOption("31");
        question.addOption("28");
        question.addOption("56");
        question.clearOption();
        assertEquals(0,question.getOptionList().size());

    }

    @Test
    public void testToString(){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("How many days are in January?");
        question.addOption("31");
        question.addOption("28");
        question.addOption("56");
        assertEquals("MultipleChoiceQuestion{question='How many days are in January?', optionList=31 28 56 }",question.toString());
    }

}
