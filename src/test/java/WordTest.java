import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{

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
  public void addDefinition_addsCorrectly(){
    Word newWord = new Word("Derp");
    Definition newDefinition = new Definition("Herp");
    newWord.addDefinition(newDefinition);
    assertEquals("Herp", newWord.getDefinition());
  }
}
