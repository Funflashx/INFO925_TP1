package model;

public class Main {

	public Main() {
		/**
		 * Creating the environment "Mars"
		 * size : 10x10 cells
		 */
		Environment mars = new Environment("Mars",10,10);
		/**
		 * Adding explorers [5]
		 */
		Explorer explorerA = new Explorer(new Position(2,5), "Anthony");
		Explorer explorerB = new Explorer(new Position(5,5), "Francois");
		Explorer explorerC = new Explorer(new Position(7,1), "Lulu");
		Explorer explorerD = new Explorer(new Position(4,10), "Boubou");
		Explorer explorerE = new Explorer(new Position(8,9), "Florgasme");
		/*mars.addAgent(explorerA);mars.addAgent(explorerB);mars.addAgent(explorerC);
		mars.addAgent(explorerD);mars.addAgent(explorerE);*/
		mars.addCell(explorerA);mars.addCell(explorerB);mars.addCell(explorerC);
		mars.addCell(explorerD);mars.addCell(explorerE);
		/**
		 * Adding minerals [7]
		 */
		mars.addCell(new Mineral(new Position(6,4), 10, TypeMineral.Gold));
		mars.addCell(new Mineral(new Position(3,4), 100, TypeMineral.Silver));
		mars.addCell(new Mineral(new Position(1,8), 20, TypeMineral.Elixir));
		mars.addCell(new Mineral(new Position(1,2), 50, TypeMineral.Elixir));
		mars.addCell(new Mineral(new Position(9,4), 5, TypeMineral.Gold));
		mars.addCell(new Mineral(new Position(10,10), 80, TypeMineral.Silver));
		mars.addCell(new Mineral(new Position(2,7), 20, TypeMineral.Gold));
		/**
		 * Adding things (roads, trees, stones) [9]
		 */
		mars.addCell(new Worthless(new Position(1,1), "Road"));
		mars.addCell(new Worthless(new Position(9,5), "Tree"));
		mars.addCell(new Worthless(new Position(9,6), "Stone"));
		mars.addCell(new Worthless(new Position(8,3), "Stone"));
		mars.addCell(new Worthless(new Position(7,2), "Stone"));
		mars.addCell(new Worthless(new Position(3,8), "Road"));
		mars.addCell(new Worthless(new Position(10,8), "Tree"));
		mars.addCell(new Worthless(new Position(1,8), "Tree"));
		mars.addCell(new Worthless(new Position(4,5), "Road"));
		
		/**
		 * Testing objects are on good position
		 */
		
		/* Agents */
		mars.getCell(2, 5).toString(); // must return Anthony
		mars.getCell(5, 5).toString(); // must return Francois
		mars.getCell(7, 1).toString(); // must return Lulu
		
		/* Minerals */ 
		mars.getCell(6, 4).toString(); // must return Gold
		mars.getCell(3, 4).toString(); // must return Silver
		
		/* Things */
		mars.getCell(1, 1).toString(); // must return Road
		mars.getCell(9, 5).toString(); // must return Tree
	}

	public static void main(String[] args) {
		new Main();
	}

}
