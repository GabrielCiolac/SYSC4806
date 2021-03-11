package com.bmgs.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class OptionTests {

    @Test
    public void testGetSelected(){
        Option option1 = new Option();
        Option option2 = new Option();
        option1.setSelected(true);
        option2.setSelected(false);
        assertEquals(false,option2.getSelected());
        assertEquals(true,option1.getSelected());

    }

    @Test
    public void testSetSelected(){
        Option option1 = new Option();
        Option option2 = new Option();
        option1.setSelected(true);
        option2.setSelected(false);
        assertEquals(false,option2.getSelected());
        assertEquals(true,option1.getSelected());
    }

    @Test
    public void testGetText(){
        Option option = new Option("Blue");
        assertEquals("Blue",option.getText());

    }

    @Test
    public void testSetText(){
        Option option = new Option();
        option.setText("Blue");
        assertEquals("Blue",option.getText());

    }

    @Test
    public void testToString(){
        Option option = new Option();
        option.setText("Purple");
        option.setSelected(true);
        assertEquals("Option{text='Purple', isSelected=true}",option.toString());

    }
}
