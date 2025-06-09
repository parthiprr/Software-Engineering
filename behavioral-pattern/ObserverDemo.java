
import java.util.ArrayList;
import java.util.List;


interface  Observer {
    void update(String message);
}

class  Subscriber implements  Observer{
    private String name;


    public Subscriber(String name){
        this.name=name;

    }
    @Override
    public void update(String message){
        System.out.println(name + " received: " + message);
    }
}


class Channel {
    private List<Observer> subscribers= new ArrayList<>();
    public void subscribe(Observer observer){
        subscribers.add(observer);
    }
    public void notifySubscribers(String message) {
        for (Observer observer : subscribers) {
            observer.update(message);
        }
    }
}


public class ObserverDemo {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Observer user1 = new Subscriber("User1");
        Observer user2 = new Subscriber("User2");

        channel.subscribe(user1);
        channel.subscribe(user2);

        channel.notifySubscribers("New Video Uploaded!");
    }
}