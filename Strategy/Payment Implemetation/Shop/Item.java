package Shop;

public class Item {
    private String UPC;
    private double price;

    public Item(String UPC, double price) {
        this.UPC = UPC;
        this.price = price;
    }

    public String getUPC() {
        return UPC;
    }

    public double getPrice() {
        return price;
    }
}
