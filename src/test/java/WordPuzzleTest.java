import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void wordPuzzle_WillReturnSameWordwithNoVowels() {
	WordPuzzle testWordPuzzle = new WordPuzzle();
    assertEquals("shhh", testWordPuzzle.puzzleSentence("shhh"));
  }

}
