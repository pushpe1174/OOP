package Tutorial_4.Q5;

public class CreditCard extends Card{

    private int pinNumber;
    private int number;

    public CreditCard(String n, int pin, int num)
    {
        super(n);
        pinNumber = pin;
        number = num;
    }
    @Override
    public boolean isExpired() {
        return false;
    }

    public String format(){
        return super.format() + "pin number - " + pinNumber +
                "\n" + "number - " + number;
    }
}
