public class Consumer {
    private String name;
    private String address;
    private ECommerceSite site;

    public Consumer(String name,String address) {
        this.name = name;
        this.address = address;
        System.out.println("Consumer called to Ecommerce");
        site = new ECommerceSite(this);
    }

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public void buy(String item) {
        site.sell(item);
    }

}
