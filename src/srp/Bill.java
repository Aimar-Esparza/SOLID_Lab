package srp;

import java.util.Date;

public class Bill {
	public String code;
	public Date billDate;
	public float billAmount;
	public float VAT;
	public float billDeduction;
	public float billTotal;
	public int deductionPercentage;
	// Fakturaren totala kalkulatzen duen metodoa.
	public void totalCalc() {
		// Dedukzioa kalkulatu
		DedukzioCalc  d = new DedukzioCalc();
		billDeduction = d.DedukzioaKalkulatu(billAmount, deductionPercentage);
		// VAT kalkulatzen dugu
		VatCalc v = new VatCalc();
		VAT = v.VatKalkulatu(billAmount);
		// Totala kalkulatzen dugu
		TotalCalc t = new TotalCalc();
		billTotal = t.TotalKalkulatu(billAmount, billDeduction, VAT);
	}
}
