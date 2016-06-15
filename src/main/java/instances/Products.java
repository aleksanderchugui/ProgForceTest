package instances;

/**
 * Created by Dxde on 15.06.2016.
 */
public class Products {
    private String  title;
    private double price;
    private enum Status {
        AVAILABLE,
        ABSENT,
        EXPECTED
    };

    public Products(){

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
