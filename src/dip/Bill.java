package dip;

import java.util.Date;

public class Bill {
	private IDeduction deduction;
    private IVAT vat;
	
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	
	public Bill(IDeduction deduction, IVAT vat) {
		this.deduction = deduction;
		this.vat=vat;
	}
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		billDeduction = deduction.calcDeduction(billAmount ,deductionPercentage);
		float VATAmount = vat.calcVAT(billAmount);
		billTotal = (billAmount - billDeduction) + VATAmount;
	}
}