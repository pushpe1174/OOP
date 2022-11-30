package Tutorial_2.Q4;

 public class VendingMachine {
     private int tokens;
     private int cans;

     public VendingMachine(){
         this.tokens = 0;
         this.cans = 0;
     }
     public void fillUp(int cans){
         this.cans += cans;
     }
     public void insertToken() {
         if(cans > 0){
             tokens += 1;
             cans -= 1;
         }else{
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