package dip;

public class Deduction {
	
	public Deduction() {}
	
	public float calcDeduction(float billAmount, int billDeduction) {
		return billAmount - billDeduction;
	}
}
