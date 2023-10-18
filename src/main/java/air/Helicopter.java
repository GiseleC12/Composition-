package air;

public class Helicopter extends AirVehicle{
    private int bladeCount;

    public Helicopter(int bladeCount, float weight, int speed, IAirVehicle airVehicle){
        super(weight,speed, airVehicle);
        this.bladeCount = bladeCount;
    }

    public int getBladeCount() {
        return bladeCount;
    }

    public void setBladeCount(int bladeCount) {
        this.bladeCount = bladeCount;
    }
}
