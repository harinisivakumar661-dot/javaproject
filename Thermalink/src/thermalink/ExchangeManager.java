package thermalink;

import java.util.ArrayList;

public class ExchangeManager {

    ArrayList<Exchange> exchanges = new ArrayList<>();

    void match(int consumerId, double required,
               IndustryManager im, HeatManager hm) {

        Industry consumer = im.find(consumerId);

        if (consumer == null) {
            System.out.println("Industry not found.");
            return;
        }

        for (Integer id : hm.heat.keySet()) {

            if (id == consumerId) {
                continue;
            }

            double available = hm.getHeat(id);

            if (available >= required) {

                Industry provider = im.find(id);

                Exchange e = new Exchange(
                    provider.name,
                    consumer.name,
                    required
                );

                exchanges.add(e);

                hm.reduce(id, required);

                System.out.println("\nMatch found!");
                e.show();

                return;
            }
        }

        System.out.println("No suitable provider found.");
    }

    void showExchanges() {

        if (exchanges.size() == 0) {
            System.out.println("No exchanges yet.");
            return;
        }

        System.out.println("\nExchange History:");

        for (Exchange e : exchanges) {
            System.out.println("-------------------");
            e.show();
        }
    }
}