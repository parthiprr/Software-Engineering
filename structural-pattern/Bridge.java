// Implementor interface (Device)
interface Device {
    void turnOn();
    void turnOff();
}

// Concrete Implementors
class TV implements Device {
    public void turnOn() {
        System.out.println("TV is turned ON");
    }
    public void turnOff() {
        System.out.println("TV is turned OFF");
    }
}

class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio is turned ON");
    }
    public void turnOff() {
        System.out.println("Radio is turned OFF");
    }
}

// Abstraction
abstract class RemoteControl {
    protected Device device;

    protected RemoteControl(Device device) {
        this.device = device;
    }

    abstract void powerOn();
    abstract void powerOff();
}

// Refined Abstraction
class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void powerOn() {
        System.out.print("Using Advanced Remote: ");
        device.turnOn();
    }

    public void powerOff() {
        System.out.print("Using Advanced Remote: ");
        device.turnOff();
    }
}

// Client code
public class Bridge {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl tvRemote = new AdvancedRemote(tv);
        RemoteControl radioRemote = new AdvancedRemote(radio);

        tvRemote.powerOn();
        tvRemote.powerOff();

        radioRemote.powerOn();
        radioRemote.powerOff();
    }
}
