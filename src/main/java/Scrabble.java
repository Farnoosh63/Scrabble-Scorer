import java.util.ArrayList;
import java.util.HashMap;

public class Scrabble {

  public Integer runScrabble(String word) {
    word = word.toUpperCase();
    char[] result = word.toCharArray();

    String letters = "AEIOULNRSTDGBCMPFHVWYKJXQZ";
    char[] lettersArray = letters.toCharArray();
    // ['A', 'E']
    Integer[] score = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 8, 8, 10, 10 };

    HashMap<Character, Integer> values = new HashMap<Character, Integer>();

    // A, 1 ........ values.get(A) -> 1

    for (char letter : lettersArray) {
      values.put(letter, score[letters.indexOf(letter)]);
    }

    Integer myInteger = 0;

    for(char someLetter : result) {
        myInteger += values.get(someLetter);
    }

    return myInteger;
  }
}



// Integer myScore = 0;
// for (Integer i = 0; i < word.length() ; i++){
//   char whatever = word.charAt(i);
//   //  if (whatever >= 'A' && whatever <= 'Z'){
//       char[] letterArray = {'A' ,'S'};
//       Integer[] scoreArray = { 1, 1};
//
//        if (contains(whatever, letterArray) ){
//       for (Integer myInteger : scoreArray){
//         myScore = myScore + myInteger;
//        }
//     }
// //  }
