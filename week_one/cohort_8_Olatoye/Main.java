package cohort_8_Olatoye;


public class Main {

    public static StringBuilder stringChallenge(String str) {
        String [] arrayOfWord = {};
        StringBuilder newArray = new StringBuilder();


        String charOne, charTwo;
        arrayOfWord = str.split("[\\W*&#@%_]");
//        return Arrays.toString(arrayOfWord);
        newArray.append(arrayOfWord[0].toLowerCase());
        for (int index = 0; index <= arrayOfWord.length-1; index++) {
            if (arrayOfWord.length <= 1) break;
            else if (index != 0) {
                charOne= String.valueOf(Character.toUpperCase(arrayOfWord[index].charAt(0)));
                charTwo = charOne.toUpperCase() + arrayOfWord[index].substring(1).toLowerCase();
                newArray.append(charTwo);
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(stringChallenge("cats-AND%dogs_are-awesome"));
    }
}
