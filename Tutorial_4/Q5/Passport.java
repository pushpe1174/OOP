package Tutorial_4.Q5;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;


    public Passport(String n, String birthLocation, int expirationYear) {
        super(n);
        this.birthLocation = birthLocation;
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    public String format(){
        return super.format() + "birthLocation - " + birthLocation +
                "expirationYear - " + expirationYear;
    }
}
