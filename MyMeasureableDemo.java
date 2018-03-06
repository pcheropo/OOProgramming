/*
 * Tomica Sachevski 01321676
 * Panteleimon Cheropoulos 01323152
 */

public class MyMeasureableDemo {

	public static void main(String[] args) {
		System.out.println("---------------Result-------------------------");

		Result res = new Result("MusterName", 5);
		res.setScore(0, 5.0);
		res.setScore(1, 3.5);
		res.setScore(2, 10.0);
		res.setScore(3, 0.0);
		res.setScore(4, 2.75);
		Result res2 = new Result("MusterName2", 2);
		res2.setScore(0, 15.0);
		res2.setScore(1, 17.0);

		Measurable[] tests = new Measurable[2];
		tests[0] = res;
		tests[1] = res2;

		for (Measurable m : tests) {
			System.out.println(m.toString());
		}
		
		System.out.println("Total Score: " + Total.getTotal(tests));
		System.out.println();
		System.out.println("---------------ThermePrice--------------------");

		ThermePrice res3 = new ThermePrice("MusterPool", 5);
		res3.setScore(0, 1.5);
		res3.setScore(1, 2.5);
		res3.setScore(2, 3.0);
		res3.setScore(3, 3.5);
		res3.setScore(4, 4.0);
		ThermePrice res4 = new ThermePrice("MusterPool2", 2);
		res4.setScore(0, 3.0);
		res4.setScore(1, 2.0);

		Measurable[] tests2 = new Measurable[2];
		tests2[0] = res3;
		tests2[1] = res4;

		for (Measurable m : tests2) {
			System.out.println(m.toString());
		}
		
		System.out.println("Total Price: " + Total.getTotal(tests2));
		System.out.println();
		System.out.println("---------------AutoShop----------------------");

		ThermePrice res5 = new ThermePrice("MusterShop", 6);
		res5.setScore(0, 1550.25);
		res5.setScore(1, 1500.45);
		res5.setScore(2, 1000.0);
		res5.setScore(3, 1200.5);
		res5.setScore(4, 1900.0);
		res5.setScore(5, 2000.0);
		ThermePrice res6 = new ThermePrice("MusterShop2", 6);
		res6.setScore(0, 2530.79);
		res6.setScore(1, 2854.98);
		res6.setScore(2, 3920.20);
		res6.setScore(3, 1250.41);
		res6.setScore(4, 2854.26);
		res6.setScore(5, 1990.40);

		Measurable[] tests3 = new Measurable[2];
		tests3[0] = res5;
		tests3[1] = res6;

		for (Measurable m : tests3) {
			System.out.println(m.toString());
		}
		
		System.out.println("Total Income: " + Total.getTotal(tests3));

	}
}