package Tutorial_4.Q3;

import java.util.ArrayList;
import java.util.Collections;

public class Run {
    public static void main(String[] args){
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        BankAccount b1 = new BankAccount(25000);
        BankAccount b2 = new BankAccount(75000);
        BankAccount b3 = new BankAccount(27000);
        list.add(b1);
        list.add(b2);
        list.add(b3);

        Collections.sort(list);
        for (BankAccount b : list)
            System.out.println(b.getBalance());
    }
}
