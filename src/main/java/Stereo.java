import java.util.ArrayList;
import java.util.concurrent.CompletionService;

public class Stereo {
    private String name;
    private ArrayList<Component> devices;

    public Stereo(String name){
        this.name = name;
        this.devices = new ArrayList<Component>();
    }

    public String getName(){
        return name;
    }
    public int getDevices(){
        return devices.size();
    }
    public String use(Component device){
        return device + " is playing.";
    }

    public void add(Component device){
        this.devices.add(device);
    }
}
