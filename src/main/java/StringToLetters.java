import java.util.Arrays;

public class StringToLetters {

    public  String StringToLetters (String str){
        if (str.length() != 0){
            str = str.replaceAll("[^A-Za-zА-Яа-я]", "");

            return str;
        } else {

            return null;
        }


    }
}


