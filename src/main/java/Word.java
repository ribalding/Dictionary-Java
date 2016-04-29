import java.util.ArrayList;

public class Word{
  private String mWord;
  private String mDefinition;
  private static ArrayList<Word> words = new ArrayList<Word>();
  private static ArrayList<Definition> definitions = new ArrayList<Definition>();
  private Integer mID;

  public Word(String input) {
    mWord = input;
    words.add(this);
    mID = words.size();
  }

  public String getWord(){
    return mWord;
  }

  public void addDefinition(Definition newDef){
    definitions.add(newDef);
  }

  public ArrayList<Definition> getDefinitions(){
    return definitions;
  }

  public Integer getID(){
    return mID;
  }

  public static void clear(){
    words.clear();
  }

  public static Word find(Integer id){
    try {
      return words.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
