package srp;

public class TotalCalc {

	public float TotalKalkulatu(float billAmount, float billDeduction, float VAT) {
		return (billAmount - billDeduction) + VAT;
	}
}
