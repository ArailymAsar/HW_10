import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class TestStringToLettersAndSpaces {

    StringToLettersAndSpaces letAndSpace;
    @BeforeEach
    void setUp(){
        letAndSpace = new StringToLettersAndSpaces();
    }

    @Order(1)
    @Test
    public void testStringToLettersAndSpacesHappyPath(){
        String str = "Нап 4 St#$, 두    뮤";
        String expectedResult = "Нап  St     ";
        String actualResult = letAndSpace.StringToLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }
    @Order(2)
    @Test
    public void testStringToLettersAndSpacesHappyPathNumbers(){
        String str = "55555";
        String expectedResult = "";
        String actualResult = letAndSpace.StringToLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(3)
    @Test
    public void testStringToLettersAndSpacesHappyPathEmptyString(){
        String str = "";
        String expectedResult = null;
        String actualResult = letAndSpace.StringToLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult,actualResult);

    }

    @Order(4)
    @Test
    public void testStringToLettersAndSpacesHappyPathSymbols() {
        String str = "%^&*(((";
        String expectedResult = "";
        String actualResult = letAndSpace.StringToLettersAndSpaces(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
