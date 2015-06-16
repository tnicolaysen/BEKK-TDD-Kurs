import java.io.IOException;

/**
 * A Display Module is responsible for displaying various screens
 * during the different stages of the game
 */
public interface DisplayModule {

	void showWelcomeScreen();
	void showPlayerAdded(String playerName);
	void showGameStartedScreen();
	void showScoreTable(GameModel model) throws IOException;
	void showEndScreen();
    // Maybe more? :)
}
