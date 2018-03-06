/*
 * Tomica Sachevski 01321676
 * Panteleimon Cheropoulos 01323152
 */

public class Result implements Measurable {

        private String name;
        private int scores;

        private double sumTotalScore;
        double arr[];

        // constructor for setting the name and the number of scores
        public Result(String name, int scores) {
                this.name = name;
                this.scores = scores;
                this.arr = new double[scores];

        }

        // ----------methods

        // sets for score which the given amount
        public void setScore(int which, double amount) {
                for (int i = 0; i < arr.length; i++) {
                        if (which == i && arr[which] == 0) {//if the given position is found and empty
                                arr[which] = amount;//then initialize this position with the given amount
                                break;
                        }
                }

                sumTotalScore = sumTotalScore + amount;
        }

        // returns score which
        public double getScore(int which) {
                return arr[which];
        }

        // returns the total score
        public double getTotalScore() {
                return sumTotalScore;
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
                return getTotalScore();
        }

}

