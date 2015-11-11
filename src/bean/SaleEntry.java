package bean;

/**
 * Created by tage on 11/11/15.
 */
public class SaleEntry {
    private String itemID = "unknown";

    private double discountCode = 1.0;

    private int numItems = 0;

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public double getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(double discountCode) {
        this.discountCode = discountCode;
    }

    public int getNumItems() {
        return numItems;
    }

    public void setNumItems(int numItems) {
        this.numItems = numItems;
    }

    public double getItemCost() {
        double cost;
        if (itemID.equals("a1234")) {
            cost = 12.99 * getDiscountCode();
        } else {
            cost = -9999;
        }
        return (roundToPennies(cost));
    }

    private double roundToPennies(double cost) {
        return (Math.floor(cost * 100) / 100.0);
    }

    public double getTotalCost() {
        return (getItemCost() * getNumItems());
    }
}
