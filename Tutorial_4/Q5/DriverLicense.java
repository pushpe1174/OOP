package Tutorial_4.Q5;

public class DriverLicense extends Card{

    private int expirationYear;

    public DriverLicense(String n, int expirationYear) {
        super(n);
        this.expirationYear = expirationYear;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    public String format(){
        return super.format() +
                "expirationYear - " + expirationYear;
    }
}
