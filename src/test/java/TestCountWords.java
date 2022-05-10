import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestCountWords {
    CountWords cw;
    @BeforeEach
    void setUp(){
        cw = new CountWords();
    }

    @Order(1)
    @Test
    public void testCountWordsHappyPathJava(){
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String word = "Java";
        int expectedResult = 5;
        int actualResult = cw.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Order(2)
    @Test
    public void testCountWordsHappyPathVersion(){
        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy version Java 8 LTS in January 2019 for commercial java use, although it will otherwise still support Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving security and other upgrades";
        String word = "version";
        int expectedResult = 2;
        int actualResult = cw.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountWordsEmptyText(){
        String text = "";
        String word = "version";
        int expectedResult = 0;
        int actualResult = cw.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountWordsEmptyWord(){
        String text = "version, while Java 17, 11 and 8 are the ";
        String word = "";
        int expectedResult = 0;
        int actualResult = cw.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCountWordsDoNotHaveWord(){
        String text = "version, while Java 17, 11 and 8 are the ";
        String word = "aplle";
        int expectedResult = 0;
        int actualResult = cw.CountWords(text, word);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
