import java.util.Arrays;

public class CountWords {

    //Напишите алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации этого слова в тексте

    public static int CountWords(String text, String word) {
        int count = 0;

        if (text.length() != 0 && word.length() != 0) {
            String[] parts = text.toLowerCase().split("( |\\p{P})");
            for (int i = 0; i < parts.length; i++){
                if (parts[i].equals(word.toLowerCase()))
                count++;
            }

            return count;

        }


        return 0;
    }



}
