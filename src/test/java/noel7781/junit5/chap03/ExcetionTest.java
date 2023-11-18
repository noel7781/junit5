package noel7781.junit5.chap03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExcetionTest {

    @Test
    void test() {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("runtime Exception");
        });
    }
}
