/*
 * Tomica Sachevski 01321676
 * Panteleimon Cheropoulos 01323152
 */

public class Autoshop implements Measurable {

        private String branch;
        private int income;

        private double sumTotalIncome;
        double arr[];

        // constructor for setting the name and the number of income
        public Autoshop(String branch, int income) {
                this.branch = branch;
                this.income = income;
                this.arr = new double[income];

        }

        // ----------methods

        // sets for branch which the given amount
        public void setIncome(int which, double amount) {
                for (int i = 0; i < arr.length; i++) {
                        if (which == i && arr[which] == 0) {
                                arr[which] = amount;
                                break;
                        }
                }

                sumTotalIncome = sumTotalIncome + amount;
        }

        // returns amount which
        public double getIncome(int which) {
                return arr[which];
        }

        // returns the total amount
        public double getTotalIncome() {
                return sumTotalIncome;
        }

        /*
         * returns a string representation of the name combinded with all scores and the
         * total score Die Methode toString() soll einen String in folgender Form
         * zurueckgeben (wenn z.B. 5 Teilergebnisse vorhanden sind): MeinName: 5.0 / 3.5
         * / 10.0 / 0.0 / 2.75 = 21.25
         */

        public String toString() {
                String result = "";
                for (int i = 0; i < arr.length; i++) {
                        if (i != arr.length - 1) {
                                result = result + arr[i] + " / ";
                        } else {
                                result = result + arr[i] + " = ";
                        }
                }
                return branch + ": " + result + getMeasure();
        }

        @Override
        public double getMeasure() {
                return getTotalIncome();
        }

}
