public class StringToLettersAndSpaces {

    public String StringToLettersAndSpaces (String str){

        if (str.length() != 0){
            str = str.replaceAll("[^A-Za-zА-Яа-я ]", "");

            return str;
        } else {

            return null;
        }

    }

}
