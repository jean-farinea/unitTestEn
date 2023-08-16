package lesson4.task2;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {

    @Test
    void shouldGetWindowMessage() {
        //given
        WindowMessage windowMessage = new WindowMessage();
        String expectedMessage = "This is the WindowMessage class";
        //when
        String thisMessage = windowMessage.getMessage();
        //then
        Assert.assertEquals(expectedMessage, thisMessage);
    }

    @Test
    void shouldGetConsoleMessage() {
        //given
        ConsoleMessage consoleMessage = new ConsoleMessage();
        String expectedMessage = "This is the ConsoleMessage class";
        //when
        String thisMessage = consoleMessage.getMessage();
        //then
        Assert.assertEquals(expectedMessage, thisMessage);
    }
}