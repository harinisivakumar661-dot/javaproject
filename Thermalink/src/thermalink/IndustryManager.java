package thermalink;

import java.util.ArrayList;

public class IndustryManager {

    ArrayList<Industry> list = new ArrayList<>();

    void add(Industry i) {
        list.add(i);
        System.out.println("Industry added.");
    }

    void showAll() {

        if (list.size() == 0) {
            System.out.println("No industries found.");
            return;
        }

        for (Industry i : list) {
            System.out.println("-------------------");
            i.show();
        }
    }

    Industry find(int id) {

        for (Industry i : list) {
            if (i.id == id) {
                return i;
            }
        }

        return null;
    }
}
