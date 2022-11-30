package Tutorial_3.Q7;

public class Car {
    private String licensePlate;
    private double speed; // kilometers per hour
    private double maxSpeed; // kilometers per hour
        // constructors
    public Car(String licensePlate1, double maxSpeed1) {
        this.licensePlate = licensePlate1;
        this.speed = 0.0;
        if (maxSpeed1 >= 0.0) {
            maxSpeed = maxSpeed1;
        } else {
            maxSpeed = 0.0;
        }
    }

    public Car(String licensePlate, double speed, double maxSpeed) {
        this.licensePlate = licensePlate;
        this.speed = speed<0 ? 0 : Math.min(maxSpeed, speed);
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println(
                "Speed : " + speed +
                        "Max Speed : " + maxSpeed +
                        "license plate : " + licensePlate
        );
    }
}
