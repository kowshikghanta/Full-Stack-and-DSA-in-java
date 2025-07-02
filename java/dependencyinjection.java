import java.lang.*;

/*Constructor injection
class Car {
    Engine engine;
    Car(Engine engine) {
        this.engine=engine;
    }
}*/

/*Setter injection
class Car {
    Engine engine;
    public void setEngine(Engine engine) {
        this.engine=engine;
    }
}*/

/*Field injection
class Car {
@Autowired
Engine engine;
}*/

class Engine {
    Engine() {
        System.out.println("This is an engine");
    }
}
