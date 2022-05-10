import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class TestStringToNumbers {

    StringToNumbers stm;
    @BeforeEach
    void setUp(){
        stm = new StringToNumbers();
    }
    @Order(1)
    @Test

    public void testStringToNumbersHappyPath (){

        String str = "1, 2, 3, 4, 5";
        int[] expectedResult ={1, 2, 3, 4, 5};
        int[] actualResult = stm.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }


    @Order(2)
    @Test

    public void testStringToNumbersHappyPathEmptyValues (){

        String str = " ";
        int[] expectedResult ={ };
        int[] actualResult = stm.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Order(3)
    @Test

    public void testStringToNumbersHappyPathWithLetters (){

        String str = " Dvfvm 15. kmv 444 f4";
        int[] expectedResult ={1, 5, 4, 4, 4, 4};
        int[] actualResult = stm.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

    @Test

    public void testStringToNumbersHappyPathNegativeNumber (){

        String str = "-1, - 2 - 3";
        int[] expectedResult ={1, 2, 3};
        int[] actualResult = stm.StringToNumbers(str);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }

}
