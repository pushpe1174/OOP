package Tutorial_2.Q4;

 public class Q4 {
     public static  void main(String[] args){
         VendingMachine machine = new VendingMachine();
         machine.fillUp(10); // fill up with ten cans
         machine.insertToken();
         machine.insertToken();
         System.out.print("Token count = ");
         System.out.println(machine.getTokenCount());
         System.out.print("Can count = ");
         System.out.println(machine.getCanCount());
     }
 }
