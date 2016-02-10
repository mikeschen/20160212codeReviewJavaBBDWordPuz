import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void wordPuzzle_WillReturnSameWordwithNoVowels() {
	WordPuzzle testWordPuzzle = new WordPuzzle();
	String userInputs = "shhh";
    assertEquals(userInputs, testWordPuzzle.puzzleSentence("shhh"));
  }

    @Test
  public void wordPuzzle_WillReturnSameWordwithMultipleVowels() {
	WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("h-td-gp-ps-cl-", testWordPuzzle.puzzleSentence("hotdogpopsicle"));
  }

}
