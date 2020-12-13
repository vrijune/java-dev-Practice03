package gamedata;


import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * This class imports the games.csv file, and prints games from the collection.
 * 
 * @author Yu-Cheng Tu
 *
 */
public class GameCollector {
	List<Game> games;

	/**
	 * This is the main method, do not modify this.
	 */
	public static void main(String[] args) {
		GameCollector gc = new GameCollector();

		String currentDir = System.getProperty("user.dir");
		gc.processFile(currentDir + "/games.csv");

		System.out.println("The first 5 games");
		System.out.println("===================");
		gc.printFirstFiveGames();
		System.out.println("===================");

		System.out.println("Number of Action games in the collection: " + gc.getNumberOfGamesByGenre(Genre.ACTION));
		System.out.println("Number of Puzzle games in the collection: " + gc.getNumberOfGamesByGenre(Genre.PUZZLE));
		System.out.println("Number of Role-Playing games in the collection: " + gc.getNumberOfGamesByGenre(Genre.RPG));
		System.out.println("Number of Sports games in the collection: " + gc.getNumberOfGamesByGenre(Genre.SPORTS));
		System.out.println("===================");

		System.out.println("The top 10 games by year and publisher");
		System.out.println("===================");
		gc.printTopTenSortedGames();
		System.out.println("===================");

		gc.exportSortedGames(currentDir + "/sortedGames.csv");

		System.out.println("Number of games per year");
		System.out.println("===================");
		Map<Integer, Integer> numOfGamesPerYear = gc.getCountOfGamesPerYear();
		gc.printGamesPerYear(numOfGamesPerYear);
	}

	private void printGamesPerYear(Map<Integer, Integer> numOfGamesPerYear) {
		Set<Integer> years = numOfGamesPerYear.keySet();
		for (Integer year : years) {
			System.out.printf("Games:%-5d Year: %4d%n", numOfGamesPerYear.get(year), year);
		}

	}

	// step c i.
	private int checkYear(String yearStr) {
		return 0;
	}

	// step c ii.
	private Genre getGenre(String genre) {
		return null;
	}

	// step c iii.
	private Game processGameDetails(String[] gameDetails) {
		int id = Integer.parseInt(gameDetails[0]);
		String game = gameDetails[1];
		String platform = gameDetails[2];
		int year = checkYear(gameDetails[3]);
		Genre genre = getGenre(gameDetails[4]);
		String publisher = gameDetails[5];
		return new Game(id, game, platform, year, genre, publisher);
	}

	// step c iv.
	private void processFile(String filePath) {
		
	}

	// step c v.
	private void printFirstFiveGames() {

	}

	// step c vi.
	private int getNumberOfGamesByGenre(Genre genre) {
		return 0;
	}

	// step c vii.
	private void printTopTenSortedGames() {
		
	}

	// step c viii.
	private void exportSortedGames(String filePath) {
		
	}

	// step c ix.
	private Map<Integer, Integer> getCountOfGamesPerYear() {
		return null;
	}
}
