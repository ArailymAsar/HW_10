import java.util.Arrays;

public class StringToNumbers {

    //Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    //(Без форматирования)

    public  int[] StringToNumbers(String str) {

        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                length++;
            }
        }

        int j = 0;
        int[] array = new int[length];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                array[j] = Character.getNumericValue(str.charAt(i));
                j++;
            }
        }

        return array;
    }
}




