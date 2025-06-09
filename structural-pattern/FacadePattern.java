// Subsystem classes
class Lights {
    void turnOn() {
        System.out.println("Lights are ON");
    }
    void turnOff() {
        System.out.println("Lights are OFF");
    }
}

class AirConditioner {
    void turnOn() {
        System.out.println("Air Conditioner is ON");
    }
    void turnOff() {
        System.out.println("Air Conditioner is OFF");
    }
}

class SecuritySystem {
    void activate() {
        System.out.println("Security System ACTIVATED");
    }
    void deactivate() {
        System.out.println("Security System DEACTIVATED");
    }
}

// Facade class
class HomeAutomationFacade {
    private Lights lights;
    private AirConditioner ac;
    private SecuritySystem security;

    public HomeAutomationFacade() {
        this.lights = new Lights();
        this.ac = new AirConditioner();
        this.security = new SecuritySystem();
    }

    void leaveHome() {
        lights.turnOff();
        ac.turnOff();
        security.activate();
        System.out.println("Home is secured!");
    }

    void arriveHome() {
        lights.turnOn();
        ac.turnOn();
        security.deactivate();
        System.out.println("Welcome home!");
    }
}

// Client code
public class FacadePattern {
    public static void main(String[] args) {
        HomeAutomationFacade home = new HomeAutomationFacade();

        home.arriveHome();
        home.leaveHome();
    }
}
