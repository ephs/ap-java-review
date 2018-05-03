package number42017;

public class Position {

	int row;
	int column;
	
	public Position(int r, int c) {
		this.row = r;
		this.column = c;
	}
	
	public void printPosition() {
			System.out.print("(" + row + "," + column + ")");	
	}

}
