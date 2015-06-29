public class PezDispenser{
	public static final int MAX_PEZ = 12;
	private String mCharacterName;

	public PezDispenser(String characterName){
		mCharacterName = characterName;
	}

	public String getCharacterName(){
		return mCharacterName;
	}
}