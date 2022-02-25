package cohort_8_Olatoye;

import java.util.Arrays;

public class Main {

    public static StringBuilder stringChallenge(String str) {
        String [] arrayOfWord = {};
        StringBuilder newArray = new StringBuilder();


        String charOne, charTwo;
        arrayOfWord = str.split("[-,/ [*]%]");
//        return Arrays.toString(arrayOfWord);
        newArray.append(arrayOfWord[0]);
        for (int index = 0; index <= arrayOfWord.length-1; index++) {
            if (index != 0) {
                charOne=arrayOfWord[index].substring(0,1);
                charTwo = charOne.toUpperCase() + arrayOfWord[index].substring(1).toLowerCase();
                newArray.append(charTwo);

            }
        }
//        StringBuilder answer = new StringBuilder();

//        for (String word : newArray) {
//            answer.append(word);
//        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(stringChallenge("cats AND*Dogs-are Awesome"));
    }
}
