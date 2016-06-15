package instances;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dxde on 15.06.2016.
 */
public class Categories {
    private String name;
    private List<Products> listOfProducts = new ArrayList<Products>();

    public Categories(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Products> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Products> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "name='" + name + '\'' +
                ", listOfProducts=" + listOfProducts +
                '}';
    }
}
