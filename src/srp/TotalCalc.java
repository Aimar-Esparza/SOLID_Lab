package srp;

public class TotalCalc {

	public float TotalKalkulatu(float billAmount, float billDeduction, float VAT, String code) {
		if (code.equals("0")) {
			return (billAmount - billDeduction);
		}
		return (billAmount - billDeduction) + VAT;
	}
}
