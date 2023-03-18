import com.company.detailes.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;

public class Lorry extends Car {


    public Lorry() {
    }

    private String carrying;



    public Lorry(String brand, String clas, String massa, Driver driver, Engine engine, String carrying) {
        super(brand, clas, massa, driver, engine);
        this.carrying = carrying;
    }

    public String getCarrying() {
        return carrying;
    }

    public void setCarrying(String carrying) {
        this.carrying = carrying;}


    @Override
    public String toString() {
        return "Lorry : " +
                "carrying - " + carrying + '\'' + super.toString();
    }
}
