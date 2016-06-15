package instances;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dxde on 15.06.2016.
 */
public class Shop {
    private String name;
    private List<Categories> listOfCategories = new ArrayList<Categories>();

    public Shop() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Categories> getListOfCategories() {
        return listOfCategories;
    }

    public void setListOfCategories(List<Categories> listOfCategories) {
        this.listOfCategories = listOfCategories;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", listOfCategories=" + listOfCategories +
                '}';
    }
}
