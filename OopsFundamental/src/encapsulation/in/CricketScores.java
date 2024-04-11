package encapsulation.in;

class Batsman{
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score = this.score+score;
	}
	public void six() {
		addRuns(6);
	}
	public void four() {
		addRuns(4);
	}
	public void two() {
		addRuns(2);
	}
	public void printScore() {
		System.out.println("Score : "+score);
	}
	
	
}

public class CricketScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman objScore = new Batsman();
		objScore.six();
		objScore.six();
		objScore.four();
		objScore.two();
		objScore.printScore();

	}

}
