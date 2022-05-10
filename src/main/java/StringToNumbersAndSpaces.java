public class StringToNumbersAndSpaces {

    public String StringToNumbersAndSpaces (String str){

        if (str.length() != 0){
            str = str.replaceAll("[^0-9 ]", "");

            return str;
        } else {

            return null;
        }

    }
}
