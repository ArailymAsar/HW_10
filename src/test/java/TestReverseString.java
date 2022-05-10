import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestReverseString {

    ReverseString rs;
    @BeforeEach
    void setUp(){
        rs = new ReverseString();
    }

    @Order(1)
    @Test
    public void testReverseStringHappyPath (){
        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";
        String actualResult = rs.ReverseString(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseStringHappyPathWithSpace (){
        String str = "Abracadabra Abracadabra ";
        String expectedResult = " arbadacarbA arbadacarbA";
        String actualResult = rs.ReverseString(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testReverseStringEpmtyString (){
        String str = "";
        String expectedResult = null;
        String actualResult = rs.ReverseString(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }



}
