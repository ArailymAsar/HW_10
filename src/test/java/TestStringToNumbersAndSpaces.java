import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestStringToNumbersAndSpaces {
    StringToNumbersAndSpaces stns;
    @BeforeEach
    void setUp(){
        stns = new StringToNumbersAndSpaces();
    }

    @Order(1)
    @Test
    public void testStringToNumbersAndSpacesHappyPath(){
        String str = "Нап 4 St#$, 두    뮤";
        String expectedResult = " 4      ";
        String actualResult = stns.StringToNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testStringToNumbersAndSpacesHappyPathOnlyNumbers(){
        String str = "0123456789999";
        String expectedResult = "0123456789999";
        String actualResult = stns.StringToNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testStringToNumbersAndSpacesHappyPathOnlyChar(){
        String str = "NUHYsc^&**";
        String expectedResult = "";
        String actualResult = stns.StringToNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testStringToNumbersAndSpacesHappyPathOnlySpace(){
        String str = "  ";
        String expectedResult = "  ";
        String actualResult = stns.StringToNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testStringToNumbersAndSpacesEmptyString(){
        String str = "";
        String expectedResult = null;
        String actualResult = stns.StringToNumbersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
