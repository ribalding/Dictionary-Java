import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Rule;

public class WordTest{

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void word_instantiatesCorrectly(){
    Word newWord = new Word("Derp");
    assertEquals(true, newWord instanceof Word);
  }

  @Test
  public void getWord_returnsCorrectly(){
    Word newWord = new Word("Derp");
    assertEquals("Derp", newWord.getWord());
  }

  @Test
  public void getID_returnsCorrectID(){
    Word newWord = new Word("Hotline");
    Integer count = 1;
    assertEquals(count, newWord.getID());
  }
}
