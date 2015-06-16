import java.util.Map;

public class HighScoreDatabasePerister implements HighScoreSystem {

	private final Database db;

	public HighScoreDatabasePerister(Database db) {
		this.db = db;
	}
	
	public void postScores(GameModel model) {
		// Get model (db.getHighScores())
		// Compare with current model
		// If any changes, update scores (db.updateHighScores(scores))
	}

    public Map<String, Integer> getScores() {
        // Get the data from the database and create a map structure
        return null;
    }

}
