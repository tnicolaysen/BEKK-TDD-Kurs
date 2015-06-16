import java.util.ArrayList;

/**
 * Represents game being played
 */
public class BowlingGame  {

	private final ArrayList<String> players;
	private final HighScoreSystem highScoreSystem;
	private final DisplayModule display;
	
	private GameModel model;

	public BowlingGame(DisplayModule displayMod, HighScoreSystem highScoreSys) {
		players = new ArrayList<String>();
		display = displayMod;
		highScoreSystem = highScoreSys;
	}

	public void registerPlayer(String playerName) {
		// TODO: Implement some code for when a player is registered
	}

	/**
	 * Adds players to the game model
	 */
	public void start() {
		String[] playersArray = players.toArray(new String[players.size()]);
		model = new GameModel(playersArray);
		
		// What did the requirements say about showing things?
	}

	public void playerRollsBall(String playerName, int pinsHit) {
		model.playerRollsBall(playerName, pinsHit);
		
		// TODO: Check for spare or strike - maybe we want to display something

        // What did the requirements say about showing things?
	}
	
	public void end() {
		// We had some requirements when finishing the game
	}

}
