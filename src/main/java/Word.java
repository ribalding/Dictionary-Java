import java.util.ArrayList;

public class Word{
  private String mWord;
  private String mDefinition;
  private static ArrayList<Word> words = new ArrayList<Word>();
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
    mDefinition = newDef.getDef();
  }

  public String getDefinition(){
    return mDefinition;
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
