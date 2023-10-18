package vehicles;

public class Motor implements IMotorised{

    private int hp;
    private int fuel;

    public Motor(int hp, int fuel){
        this.hp = hp;
        this.fuel = fuel;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine(){
        System.out.println("Engine stopped");
    }

    @Override
    public void setFuel(int fuel){
        this.fuel = fuel;
    }

    @Override
    public int getFuel(){
        return this.fuel;
    }
}
