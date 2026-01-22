public class Client {
    public static void main(String[] args)  {
        Subject designPatterns = new Channel("DESIGN-PATTERNS");
        Observer user1 = new User("Vokhid");
        Observer user2 = new User("Akmal");

        designPatterns.subscribe(user1);
        designPatterns.subscribe(user2);

        designPatterns.uploadVideo("Observer-design-pattern!");
        designPatterns.unsubscribe(user1);
        designPatterns.uploadVideo("Mediator-design-pattern!");

    }
}
