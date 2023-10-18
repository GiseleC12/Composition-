package air;

public abstract class AirVehicle implements IAirVehicle{
    private float weight;
    private int speed;
    private IAirVehicle airVehicle;
    
    public AirVehicle(float weight, int speed, IAirVehicle airVehicle){
        this.weight = weight;
        this.speed = speed;
        this.airVehicle = airVehicle;
    }

    @Override
    public float getWeight() {
        return weight;
    }
    @Override
    public void setWeight(float weight) {
        this.weight = weight;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public IAirVehicle getAirVehicle() {
        return airVehicle;
    }

    public void setAirVehicle(IAirVehicle airVehicle) {
        this.airVehicle = airVehicle;
    }
}
