import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        IEventListener clickListener;
        String click;

        Scanner sc = new Scanner(System.in);
        click = sc.nextLine();

        if (click.equals("left")) {
            clickListener = new LeftClickListener();
        } else {
            clickListener = new RightClickEventListener();
        }

        clickListener.OnEvent();
    }
}
