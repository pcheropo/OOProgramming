/*
 * Tomica Sachevski 01321676
 * Panteleimon Cheropoulos 01323152
 */

public class Total {
	//return the Total Summe
	public static double getTotal (Measurable[] data){
	
		double sum = 0.0;
		for (Measurable m: data)
			if (m != null){
				sum = sum + m.getMeasure();
			}
		return sum;
	}
}
