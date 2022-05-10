public class StartsWithLetter {

    //Написать алгоритм StartsWithLetter, который принимает на вход текст,
    // и возвращает в виде строки все слова, которые начинаются с буквы l.

    public static String StartsWithLetter(String str, char letter){

        if (str.length() != 0 && str.length() != 0) {
            String[] parts = str.toLowerCase().split("( |\\p{P})");
            String newString = "";
            for (int i = 0; i < parts.length; i++){
                if (parts[i].toLowerCase().charAt(0) == letter){
                    newString = parts[i].concat(newString);
                }

            }
            return newString;

        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(StartsWithLetter("As a decrepit father takes delight" +
                "To see his active child do deeds of youth," +
                "So I, made lame by fortune’s dearest spite," +
                "Take all my comfort of thy worth and truth." +
                "For whether beauty, birth, or wealth, or wit," +
                "Or any of these all, or all, or more," +
                "Entitled in thy parts do crownèd sit," +
                "I make my love engrafted to this store." +
                "So then I am not lame, poor, nor despised," +
                "Whilst that this shadow doth such substance give" +
                "That I in thy abundance am sufficed," +
                "And by a part of all thy glory live." +
                "Look what is best, that best I wish in thee." +
                "This wish I have; then ten times happy me.", 'l'));
    }
}
