import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

 public class ScrabbleTest {

 //The Scrabble score take a letter and returns a Scrabble score for that letter.For example we expect an input of S to return 1.

 @Test
 public void runScrabble_returnsScoreForSingleLetter_1() {
   Scrabble testScrabble = new Scrabble();
   Integer expected = 1;
   assertEquals(expected, testScrabble.runScrabble("S"));
 }

 //The Scrabble score take all the letters that are valued the same number and returns a Scrabble score for the same number multiple by the number od letters.For example we expect an input of AEIOULNRST to return 10.

 @Test
 public void runScrabble_returnsScoreforAllLettersOfSomeValue_10() {
   Scrabble testScrabble = new Scrabble();
   Integer expected = 10;
   assertEquals(expected, testScrabble.runScrabble("AEIOULNRST"));
 }

 //The Scrabble score take a word and returns a Scrabble score for that word.For example we expect an input of ACE to return 5.

 //The Scrabble score take a letter and returns a Scrabble score for that letter regardless of case.For example we expect an input of a to return 1.

//The Scrabble score take a word mixed lower and upper case and returns a Scrabble score for that word.For example we expect an input of Ace to return 5.

}
