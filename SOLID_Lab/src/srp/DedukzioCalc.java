package srp;

public class DedukzioCalc {

	public float DedukzioaKalkulatu(float billAmount, int deductionPercentage) {
		if (billAmount >50000){
			 return (billAmount * deductionPercentage +5) / 100;
		}else { 
			return (billAmount * deductionPercentage) / 100;
		}
		
	}
}
