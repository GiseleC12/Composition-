package air;

public class Plane extends AirVehicle implements IRadar{
    private int wheelCount;
    private IRadar radar;

    public Plane(int wheelCount, IRadar radar, float weight, int speed, IAirVehicle airVehicle){
        super(weight, speed, airVehicle);
        this.wheelCount = wheelCount;
        this.radar = radar;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public IRadar getRadar() {
        return radar;
    }

    public void setRadar(IRadar radar) {
        this.radar = radar;
    }

    @Override
    public void setRadarDistance(int distance){
        this.radar.setRadarDistance(distance);
    }

    @Override
    public int getRadarDistance(){
        return this.radar.getRadarDistance();
    }

    @Override
    public void setRadarSpeed(int speed){
        this.radar.setRadarSpeed(speed);
    }

   @Override
   public int getRadarSpeed(){
       return this.radar.getRadarSpeed();
   }
   @Override
   public void setRadarModel(String model){
       this.radar.setRadarModel(model);
   }
   @Override
   public String getRadarModel(){
       return this.radar.getRadarModel();
   }



}
