import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzArrayNull() {
        ArrayList<String> testArr = null;
        ArrayList<String> resultArr = (ArrayList<String>) fizzBuzz.fizzBuzzArray(testArr);
        assertNull(resultArr);
    }

    @Test
    void fizzBuzzArray() {
        List<String> testArr = new ArrayList<>();
        List<String> expectedArr = new ArrayList<>();

        testArr.add("fad");
        testArr.add("fab");
        testArr.add("cab");

        expectedArr.add("Fizz");
        expectedArr.add("FizzBuzz");
        expectedArr.add("Buzz");

        List<String> resultsArr = fizzBuzz.fizzBuzzArray(testArr);

        assertArrayEquals(expectedArr.toArray(), resultsArr.toArray());

    }


}