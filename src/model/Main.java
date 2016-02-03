package model;

public class Main {

	public Main() {
		Environment myEnvironment = new Environment("Mars",10,10);
		
		Explorer a = new Explorer(new Position(2,5), "Anthony");
		Explorer b = new Explorer(new Position(5,5), "François");
		Explorer c = new Explorer(new Position(7,1), "Lulu");
		Explorer d = new Explorer(new Position(4,10), "Boubou");
		Explorer e = new Explorer(new Position(8,9), "Florgasme");
		
		Mineral ma = new Mineral(new Position(6,4), 10, TypeMineral.Gold);
		Mineral mb = new Mineral(new Position(3,4), 100, TypeMineral.Silver);
		Mineral mc = new Mineral(new Position(1,8), 20, TypeMineral.Elixir);
		Mineral md = new Mineral(new Position(1,2), 50, TypeMineral.Elixir);
		Mineral me = new Mineral(new Position(9,4), 5, TypeMineral.Gold);
		Mineral mf = new Mineral(new Position(10,10), 80, TypeMineral.Silver);
		Mineral mg = new Mineral(new Position(2,7), 20, TypeMineral.Gold);
		
		Worthless wa = new Worthless(new Position(1,1), "Road");
		Worthless wb = new Worthless(new Position(9,5), "Tree");
		Worthless wc = new Worthless(new Position(9,6), "Stone");
		Worthless wd = new Worthless(new Position(8,3), "Stone");
		Worthless we = new Worthless(new Position(7,2), "Stone");
		Worthless wf = new Worthless(new Position(3,8), "Road");
		Worthless wg = new Worthless(new Position(10,8), "Tree");
		Worthless wh = new Worthless(new Position(1,8), "Tree");
		Worthless wi = new Worthless(new Position(4,5), "Road");
		
		
		
		
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
