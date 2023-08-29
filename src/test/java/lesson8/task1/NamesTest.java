package lesson8.task1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class NamesTest {

    @Test
    void shouldRemoveDuplicateNames() {
        //given
        Set<String> names = new HashSet<>();
        names.add("Anna");
        names.add("Catherine");
        names.add("Timon");
        names.add("Anna");

        Set<String> expectedNames = new HashSet<>();
        expectedNames.add("Anna");
        expectedNames.add("Catherine");
        expectedNames.add("Timon");

        //when
        Names.removeDuplicateNames(names);

        //then
        assertEquals(expectedNames, names);
    }

    @Test
    void shouldReplaceName() {
        //given
        Set<String> names = new HashSet<>();
        names.add("Anna");
        names.add("Catherine");
        names.add("Timon");

        Set<String> expectedNames = new HashSet<>();
        expectedNames.add("Joanna");
        expectedNames.add("Catherine");
        expectedNames.add("Timon");

        //when
        Names.replaceName(names, "Anna", "Joanna");

        //then
        assertEquals(expectedNames, names);
    }

    @Test
    void shouldPrintReverseOrder() {
        //given
        Set<String> names = new HashSet<>();
        names.add("Anna");
        names.add("Catherine");
        names.add("Timon");
        names.add("Ted");

        Set<String> expectedNames = new HashSet<>();
        expectedNames.add("Ted");
        expectedNames.add("Timon");
        expectedNames.add("Catherine");
        expectedNames.add("Anna");

        //when
        Names.reverseOrder(names);

        //then
        assertEquals(expectedNames, names);
    }
}