import com.company.Person;
import com.company.detailes.Engine;
import com.company.professions.Driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Driver driver = new Person("Kim Mark","7years", 26 );
        Engine engine = new Engine("250km/h","Tokio,Japan");

        SportCar sportCar = new SportCar("LADA","GZ","1ton",driver ,engine , "30LS");
        System.out.println(sportCar);

        Scanner sc = new Scanner(System.in);
        Driver driver1 = new Person(sc.nextLine(),sc.nextLine(),sc.nextInt());
        Engine engine1 = new Engine(sc.nextLine(),sc.nextLine());

        Lorry lorry = new Lorry(sc.nextLine() ,sc.nextLine(), sc.nextLine(),driver1,engine1,sc.nextLine() );
        System.out.println(lorry);
}
}