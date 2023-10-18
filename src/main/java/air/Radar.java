package air;

public class Radar implements IRadar {
    private int distance;
    private int speed;
    String model;

    public Radar(int distance, int speed, String model){
        this.distance = distance;
        this.speed = speed;
        this.model = model;
    }

    @Override
    public void setRadarDistance(int distance){
        this.distance = distance;
    }

    @Override
    public int getRadarDistance(){
        return this.distance;
    }

    @Override
    public void setRadarSpeed(int speed){
        this.speed = speed;
    }

   @Override
   public int getRadarSpeed(){
       return this.speed;
   }
   @Override
   public void setRadarModel(String model){
       this.model = model;
   }
   @Override
   public String getRadarModel(){
       return this.model;
   }
}
