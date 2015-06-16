import java.io.*;

public class ConsoleDisplay implements DisplayModule {
    private final PrintWriter streamWriter;

    // By using OutputStream as an abstraction we enable testing
	public ConsoleDisplay(OutputStream outputStream) {
        streamWriter = new PrintWriter(outputStream, true);
    }
	
	/**
	 * Shows a list of all the players and all the throws
	 * with the scores.
	 * 
	 * Example:
	 * Torstein: X  [13] | 3 - [16] | 7 / [36] | X   [61] | X  ... 
	 * Bob:    1 2 [3] | 6 / [16] | 3 - [19] | 2 5 [26] | 1 / ...
	 * 
	 * @param model A data model representing the players and their throws
	 * @throws IOException If something is wrong with the output stream
	 */
	public void showScoreTable(GameModel model) throws IOException {
		// I wonder what we could use here to calculate the total score...

		// for each player
			// for each frame
				// writer.write("");
        streamWriter.println("Hei");
    }

	public void showWelcomeScreen() {
		// TODO Auto-generated method stub
		
	}

	public void showPlayerAdded(String playerName) {
		// TODO Auto-generated method stub
		
	}

	public void showGameStartedScreen() {
		// TODO Auto-generated method stub
		
	}

	public void showEndScreen() {
		// TODO Auto-generated method stub
		
	}
}
