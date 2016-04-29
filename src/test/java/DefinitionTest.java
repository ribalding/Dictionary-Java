import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Rule;

public class DefinitionTest{
  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void definition_instantiatesCorrectly(){
    Definition newDefinition = new Definition("Hotline Bling");
    assertEquals(true, newDefinition instanceof Definition);
  }

  @Test
  public void getDef_returnsCorrectDefinition(){
    Definition newDefinition = new Definition("Hotline Bling");
    assertEquals("Hotline Bling", newDefinition.getDef());
  }
}
