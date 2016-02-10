import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void scrabbleScore_WillReturnScoreForWord() {

    
    Scrabble testScrabble = new Scrabble();
    Integer score = 4;
    assertEquals(score, testScrabble.scrabbleScore("rule"));
  }

}
