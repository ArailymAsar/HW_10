public class StringToNumbers_Task16 {

    public String StringToNumbers_Task16 (String str){

        if (str.length() != 0){
            str = str.replaceAll("[^0-9]", "");

            return str;
        } else {

            return null;
        }

    }
}
