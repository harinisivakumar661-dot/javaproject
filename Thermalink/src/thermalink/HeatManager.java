package thermalink;

import java.util.HashMap;

public class HeatManager {

    HashMap<Integer, Double> heat = new HashMap<>();

    void addHeat(int id, double value) {
        heat.put(id, value);
        System.out.println("Waste heat added.");
    }

    void showHeat(IndustryManager im) {

        if (heat.size() == 0) {
            System.out.println("No waste heat available.");
            return;
        }

        System.out.println("\nAvailable Waste Heat:");

        for (Integer id : heat.keySet()) {

            Industry i = im.find(id);

            if (i != null) {
                System.out.println(
                    i.name + " : " + heat.get(id) + " kWh"
                );
            }
        }
    }

    double getHeat(int id) {
        if (heat.containsKey(id)) {
            return heat.get(id);
        }

        return 0;
    }

    void reduce(int id, double value) {

        double oldHeat = getHeat(id);
        heat.put(id, oldHeat - value);
    }
}