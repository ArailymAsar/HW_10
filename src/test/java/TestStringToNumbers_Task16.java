import org.junit.jupiter.api.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class TestStringToNumbers_Task16 {

    StringToNumbers_Task16 stm16;
    @BeforeEach
    void setUp(){
        stm16 = new StringToNumbers_Task16();
    }
    @Order(1)
    @Test
    public void testStringToNumbers_Task16HappyPath (){

        String str = "Нап 4 St#$, 두    뮤";
        String expectedResult = "4";
        String actualResult = stm16.StringToNumbers_Task16(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbers_Task16HappyPathOnlyNumber (){

        String str = "0123456789";
        String expectedResult = "0123456789";
        String actualResult = stm16.StringToNumbers_Task16(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbers_Task16HappyPathOnlyChar (){

        String str = "jduhc%%buhc";
        String expectedResult = "";
        String actualResult = stm16.StringToNumbers_Task16(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbers_Task16HappyPathEmptyString (){

        String str = "";
        String expectedResult = null;
        String actualResult = stm16.StringToNumbers_Task16(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
