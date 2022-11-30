package Tutorial_3.Q3;

import java.util.Random;

public class VotingMachine {
    private int Labour;
    private int Conservative;

    public VotingMachine(){
       clear();
    }
    public void clear(){
        Labour = 0;
        Conservative = 0;
    }

    public void setLabour() {
        Labour = voteRandom();
    }

    public void setConservative() {
        Conservative = voteRandom();
    }

    public int getLabour() {
        return Labour;
    }

    public int getConservative() {
        return Conservative;
    }

    public int voteRandom(){
        Random random = new Random();
        return random.nextInt(101);
    }
    
}
