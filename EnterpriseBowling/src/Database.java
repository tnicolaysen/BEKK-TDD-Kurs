import java.util.Map;

/**
 * The database is where high scores are stored
 */
public interface Database {
	Map<String, Integer> getHighScores();
	void updateHighScores(Map<String, Integer> scores);
}
