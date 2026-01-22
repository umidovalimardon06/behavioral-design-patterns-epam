import lombok.Data;

import java.util.ArrayList;

@Data
public class Channel implements Subject{

    public String name;
    private ArrayList<Observer> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Observer obs){
        if (subscribers.contains(obs)) System.out.println("Already in!");
        else {
            subscribers.add(obs);
            System.out.println("SUB:: "+obs.getName()+" subscribed to "+this.getName());
        }
    }
    @Override
    public void unsubscribe(Observer obs) {
        if (subscribers.contains(obs)) {
            subscribers.remove(obs);
            System.out.println("UNSUB:: "+obs.getName()+" unsubscribed from "+this.getName());
        } else {
            System.out.println("User not subscribed at all!");
        }
    }

    @Override
    public void notifyVideo(String videoTitle) {
        subscribers.forEach(subscribers -> subscribers.update(
                "New video: " + videoTitle));
        System.out.println();
    }

    public void uploadVideo(String message) {
        notifyVideo(message);
    }

}
