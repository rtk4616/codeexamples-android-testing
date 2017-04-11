package com.vogella.android.test.juntexamples;

import com.vogella.android.test.juntexamples.model.TolkienCharacter;

import org.junit.Test;

import java.util.List;

import static com.vogella.android.test.juntexamples.model.Race.HOBBIT;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by vogella on 19.06.16.
 */

public class DataModelTests {

    @Test
    public void validateTolkeinCharactorsInitializationWorks() {
        TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
        //age is 33
        //name is "Frodo"
        //name is not "Frodon"
        fail("implement");
    }

    @Test
    public void checkEquals(){
        Object jake = new TolkienCharacter("Jake", 43, HOBBIT);
        Object sameJake = jake;
        Object jakeClone = new TolkienCharacter("Jake",12, HOBBIT);
        // check that:
        // jack is equal to sameJake
        // jack is equal to jakeClone
        fail("implement");
    }


    @Test
    public void checkInheritance() {
        //find better assertions
        DataService dataService = new DataService();
        TolkienCharacter tolkienCharacter = dataService.getFellowship().get(0);
        // checkthat tolkienCharacter.getClass is not a movie class
        fail("implement");
    }

    @Test
    public void ensureThatFrodoAndGandalfArePartOfTheFellowsip() {
        DataService dataService = new DataService();
        List<TolkienCharacter> fellowship = dataService.getFellowship();

        // ensure that Frodo and Gandalf are part of the fellowship
        fail("implement");
    }

    @Test
    public void testThatOneRingBearerIsPartOfTheFellowship() {
        DataService dataService = new DataService();
        List<TolkienCharacter> fellowship = dataService.getFellowship();

        // test that at least one ring bearer is part of the fellowship
        assertTrue(false);
    }

    @Test
    public void ensureOrdering() {
        DataService dataService = new DataService();
        List<TolkienCharacter> fellowship = dataService.getFellowship();

        // ensure that the order of the fellowship is:
        //frodo, sam, merry,pippin, gandalf,legolas,gimli,aragorn,boromir
        fail("implement");
    }

    @Test
    public void ensureAge() {
        DataService dataService = new DataService();
        List<TolkienCharacter> fellowship = dataService.getFellowship();

        // ensure that all hobbits and men are younger than 100 years


        // also ensure that the elfs, dwars the maia are all older than 100 years
        fail("implement");
    }

    @Test
    public void ensureThatFellowsStayASmallGroup() {
        DataService dataService = new DataService();
        List<TolkienCharacter> fellowship = dataService.getFellowship();

        // Write a test to ensure that this thrown an IndexOutOfBoundsException
        fail("implement");
    }





}
