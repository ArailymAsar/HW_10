public class ReverseString {
    //Написать алгоритм ReverseString, который переворачивает строку:
    //Test Data:
    //“Abracadabra” → “arbadacarbA”

    public  String ReverseString (String str){

        if (str.length() != 0){
            String newString = "";
            for (int i = str.length()-1 ; i < str.length() && i >= 0; i--){
                newString =newString + str.charAt(i);
            }
            return newString;
        }
        return null;
    }




}
