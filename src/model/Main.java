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
		Explorer explorerB = new Explorer(new Position(5,5), "François");
		Explorer explorerC = new Explorer(new Position(7,1), "Lulu");
		Explorer explorerD = new Explorer(new Position(4,10), "Boubou");
		Explorer explorerE = new Explorer(new Position(8,9), "Florgasme");
		mars.addAgent(explorerA);mars.addAgent(explorerB);mars.addAgent(explorerC);
		mars.addAgent(explorerD);mars.addAgent(explorerE);
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
	}

	public static void main(String[] args) {
		new Main();
	}

}
