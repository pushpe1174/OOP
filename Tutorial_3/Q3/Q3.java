package Tutorial_3.Q3;

public class Q3 {
    public static void main(String[] args){
        VotingMachine vote = new VotingMachine();
        vote.setConservative();
        vote.setLabour();
        System.out.println("Labour - " + vote.getLabour());
        System.out.println("Conservative - " + vote.getConservative());
        vote.clear();
        System.out.println("Labour - " + vote.getLabour());
        System.out.println("Conservative - " + vote.getConservative());
    }
}
