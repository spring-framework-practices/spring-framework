package com.springinaction.springidol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"sneaky-magician.xml"})
public class MindReaderTest {
    @Autowired
    MindReader magician;

    @Autowired
    Thinker volunteer;

    //<start id="testMindReader"/>
    @Test
    public void magicianShouldReadVolunteersMind() {
        volunteer.thinkOfSomething("Queen of Hearts");

        assertEquals("Queen of Hearts", magician.getThoughts());
    }
    //<end id="testMindReader"/>
}
