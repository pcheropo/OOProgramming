/*
 * Tomica Sachevski 01321676
 * Panteleimon Cheropoulos 01323152
 */

public class ThermePrice implements Measurable {
        private String name;
        private int poolNumber;
        private double sumTotalPreis;
        double arr[];

        // constructor for setting the name and the number of poolNumber
        public ThermePrice(String name, int poolNumber) {
                this.name = name;
                this.poolNumber = poolNumber;
                this.arr = new double[poolNumber];
        }

        // ----------methods

        // sets for poolNumber which the given amount
        public void setPreis(int which, double preis) {
                for (int i = 0; i < arr.length; i++) {
                        if (which == i && arr[which] == 0) {
                                arr[which] = preis;
                                break;
                        }
                }

                sumTotalPreis = sumTotalPreis + preis;

        }

        // returns amount which
        public double getPreis(int which) {
                return arr[which];
        }

        // returns the total amount
        public double getTotalPreis() {
                return sumTotalPreis;
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
                return name + ": " + result + getMeasure();
        }

        @Override
        public double getMeasure() {
                return getTotalPreis();
        }
}
