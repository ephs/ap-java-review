package number22006;

public abstract class TaxableItem implements Item{

	private double taxRate;
	
	public abstract double getListPrice();
	
	public TaxableItem(double rate){
		taxRate = rate;
	}
	
	// WRITE YOUR CODE HERE (PART A)
	public double purchasePrice() {
		
		return 0; //You can, and should, modify this line during part A
		
	}
	
}
