import com.company.detailes.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class SportCar extends Car {

    public SportCar() {
    }

    public SportCar(String brand, String clas, String massa, Driver driver, Engine engine, String speed) {
        super(brand, clas, massa, driver, engine);
        this.speed = speed;
    }

    private String speed ;


    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar : " +super.toString()+
                " , speed - " + speed ;
    }
}
