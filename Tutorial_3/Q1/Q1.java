package Tutorial_3.Q1;

public class Q1 {
    public static void main(String[] args){
        VendingMachine1 machine = new VendingMachine1(100);
        machine.fillUp(10); // fill up with ten cans
        machine.insertToken();
        machine.insertToken();
        System.out.print("Token count = ");
        System.out.println(machine.getTokenCount());
        System.out.print("Can count = ");
        System.out.println(machine.getCanCount());
    }
}
