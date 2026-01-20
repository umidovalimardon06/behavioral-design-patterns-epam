public class ECommerceSite {

    private Consumer consumer;
    private Driver driver;

    public ECommerceSite(Consumer consumer) {
        this.consumer = consumer;
        System.out.println("Ecommerce: called to Driver");
        driver = new Driver();
    }

    public void sell(String item) {
        System.out.println("Ecommerce: " + item + " sold to: "+consumer.getName());
        driver.deliver();
    }

}
