package dip;

public class VAT implements IVAT {

	public float calcVAT(float billAmount){
		return billAmount * 5;
	}
}
