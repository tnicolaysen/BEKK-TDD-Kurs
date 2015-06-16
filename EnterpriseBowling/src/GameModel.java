import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

/**
 * Keeps track of players and their score
 */
public class GameModel {
    /**
     * Player 1 =>  [1,9,4,1,3,3]
     * Player 2 =>  [10, 10, 10, 2, 1]
     */
	private final Map<String, ArrayList<Integer>> internalModel;
	
	public GameModel(String[] players){
		 internalModel = new Hashtable<String, ArrayList<Integer>>();
		 
		 // Add players to game
		 for(String playerName : players) {
			 internalModel.put(playerName, new ArrayList<Integer>());
		 }
	}
	
	public void playerRollsBall(String name, int pinsHit) {
		// TODO: Error handling
		ArrayList<Integer> rolls = internalModel.get(name);
		rolls.add(pinsHit);
	}
	
	public int[] getPlayerRolls(String name) {
		ArrayList<Integer> rolls = internalModel.get(name);

		// Convert to array of int, instead of Integer
		int[] intArray = new int[rolls.size()];
		for (int i = 0; i < rolls.size(); i++) {
			intArray[i] = rolls.get(i);
		}
		
		return intArray;
	}
}
