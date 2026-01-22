import lombok.Data;

@Data
public class User implements Observer{
    private String name;
    public User(String name) {
        this.name = name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println("Hey "+this.getName()+" head over to::"+videoTitle);
    }
}
