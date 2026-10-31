package thermalink;

public class Exchange {

    String provider;
    String consumer;
    double heat;

    Exchange(String provider, String consumer, double heat) {
        this.provider = provider;
        this.consumer = consumer;
        this.heat = heat;
    }

    void show() {
        System.out.println("Provider: " + provider);
        System.out.println("Consumer: " + consumer);
        System.out.println("Heat Exchanged: " + heat + " kWh");
        System.out.println("Status: Completed");
    }
}
