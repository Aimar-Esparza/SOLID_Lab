package dip;

public class Deduction implements IDeduction{
	
	public float calcDeduction(float billAmount, int billDeduction) {
		return billAmount - billDeduction;
	}
}
