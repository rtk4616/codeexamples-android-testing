package com.vogella.android.test.juntexamples.hamcresttests;

import com.vogella.android.test.juntexamples.DataService;
import com.vogella.android.test.juntexamples.model.TolkienCharacter;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.vogella.android.test.juntexamples.model.Race.HOBBIT;
import static junit.framework.Assert.fail;


/**
 * Created by vogella on 19.06.16.
 */

public class HamcrestTests {

    @Test
    public void firstHamcrestMatcherForLists( ) {
        List<Integer> list = Arrays.asList(5, 2, 4);
        // test has list has size of 3
        // contains the elements 2, 4, 5 a any order
        // That every item is greater than 1
        fail("not implemented yet");
    }

    @Test
    public void tolkienCharacterShouldHaveProperties() {
        TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
        // ensure that TolkienCharacter has the bean property "name"
        // ensure that TolkienCharacter has the bean property "age"

        // Hint: maybe you need to change your data model
        fail("not implemented yet");
    }

    @Test
    public void validateTolkeinCharactorsInitializationWorks() {
        TolkienCharacter frodo = new TolkienCharacter("Frodo", 33, HOBBIT);
        //age is 33
        //name is "Frodo"
        //name is not "Frodon"
        fail("not implemented yet");
    }

    @Test
    public void ensureThatFellowsAreNotOrcs() {
        List<TolkienCharacter> fellowship = new DataService().getFellowship();
        // ensure that no fellows is a orc
        fail("not implemented yet");
    }
}
