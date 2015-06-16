import java.util.Map;

/**
 * The high score system contains business rules for when and how scores are saved
 */
public interface HighScoreSystem {
	void postScores(GameModel model);
    Map<String, Integer> getScores();
}
