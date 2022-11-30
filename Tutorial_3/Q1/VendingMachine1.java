package Tutorial_3.Q1;

public class VendingMachine1 {
        private int tokens;
        private int cans;

        // default constructor with 10 soda cans
        public VendingMachine1() {
            this.tokens = 0;
            this.cans = 10;
        }

        //constructor with a given parameter
        public VendingMachine1(int cans) {
            this.tokens = 0;
            this.cans = cans;
        }

        public void fillUp(int cans) {
            this.cans += cans;
        }

        public void insertToken() {
            if (cans > 0) {
                tokens += 1;
                cans -= 1;
            } else {
                System.out.println("Sorry, we're out of cans!");
            }
        }

        public int getTokenCount() {
            return tokens;
        }

        public int getCanCount() {
            return cans;
        }
    }
