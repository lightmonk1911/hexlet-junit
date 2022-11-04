package hexlet.junit.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SomeClassTest {

    @Test
    public void testSomeClass() {
        Assertions.assertEquals(14, SomeClass.sum(12, 2));
    }
}
