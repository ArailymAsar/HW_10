import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class TestStringToLetters {


    StringToLetters srl;
    @BeforeEach
    void setUp() {
        srl = new StringToLetters();
    }

    @Order(1)
    @Test

    public void testStringToLettersHappyPath(){
        String str = "Нап 4 St#$, 두 뮤";
        String expectedResult = "НапSt";
        String actualResult = srl.StringToLetters(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(2)
    @Test

    public void testStringToLettersHappyPathEmptyString(){
        String str = " ";
        String expectedResult = "";
        String actualResult = srl.StringToLetters(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(3)
    @Test

    public void testStringToLettersHappyPathEmptyString2(){
        String str = "";
        String expectedResult = null;
        String actualResult = srl.StringToLetters(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Test

    public void testStringToLettersOnlyChar(){
        String str = "dddыыыы";
        String expectedResult = "dddыыыы";
        String actualResult = srl.StringToLetters(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }


}
