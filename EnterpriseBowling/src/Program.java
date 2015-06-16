public class Program {

	/**
	 * Just an example of how a game might look
	 */
	public static void main(String[] args) {

		// Configure the components to inject
		DisplayModule displayModule = new ConsoleDisplay(System.out);
		Database db = null; // Create a stub if you want this
		HighScoreSystem highScoreSystem = new HighScoreDatabasePerister(db);
		
		BowlingGame game = new BowlingGame(displayModule, highScoreSystem);
		
		game.registerPlayer("Torstein");
		game.registerPlayer("Bob");
		game.start();
		
		game.playerRollsBall("Torstein", 1);
		game.playerRollsBall("Torstein", 8); 
		
		// Score should be displayed (Torstein has 9 points)
		
		game.playerRollsBall("Bob", 10); // Strike!
		// Animation should be shown
		
		// Score should be displayed (Bob currently has 10 points)
		
		game.end();
		// End screen and final score is shown
		// High score is posted behind the scenes
	}

}
