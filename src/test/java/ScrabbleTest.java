import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_WillReturnScoreForWord() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 4;
    assertEquals(score, testScrabble.scrabbleScore("rule"));
  }

  @Test
  public void scrabbleScore_Adds2PointsIfCharIsDOrG() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 5;
    assertEquals(score, testScrabble.scrabbleScore("dog"));
  }

  @Test
  public void scrabbleScore_Adds3PointsIfCharIsBCMP() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 10;
    assertEquals(score, testScrabble.scrabbleScore("bump"));
  }

  @Test
  public void scrabbleScore_Adds4PointsIfCharIsFHVWY() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 9;
    assertEquals(score, testScrabble.scrabbleScore("hay"));
  }

  @Test
  public void scrabbleScore_Adds5PointsIfCharIsK() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 10;
    assertEquals(score, testScrabble.scrabbleScore("key"));
  }

  @Test
  public void scrabbleScore_Adds8PointsIfCharIsJX() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 17;
    assertEquals(score, testScrabble.scrabbleScore("jax"));
  }

  @Test
  public void scrabbleScore_Adds10PointsIfCharIsQZ() {
    Scrabble testScrabble = new Scrabble();
    Integer score = 23;
    assertEquals(score, testScrabble.scrabbleScore("quazi"));
  }

}
