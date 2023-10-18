import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import products.IProduct;
import products.Product;
import vehicles.Motor;
import vehicles.Speedboat;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpeedboatTest {

    Speedboat speedboat;
    IProduct baseProduct;

    @BeforeEach
    void setUp(){
        //baseProduct = new IProduct()
        speedboat = new Speedboat(50, 30,new Product(350, 5, "BMX" ) ,"Wood", new Motor(100, 15));
        //assertThat(speedboat.getHp()).isEqualTo(100);
    }

    @Test
    void canGetHp(){
        assertThat(speedboat.getHp()).isEqualTo(100);
    }

    @Test
    void canSetMotor(){
        //in setUp, motor was defined using new Motor(100,15)
        Motor betterMotor = new Motor(1000,100); //creates new motor object
        speedboat.setMotor(betterMotor); //sets motor object with new numbers -> this.motor
        assertThat(speedboat.getHp()).isEqualTo(1000); //Tests if numbers have changed
    }


}
