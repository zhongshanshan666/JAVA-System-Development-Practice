package chapter11;

public class ProduceItem extends GenericItem{
    public void setExpiration(String newDate) {
        expirationDate = newDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public void printItem() {
        System.out.println(itemName + " " + itemQuantity + " (Expires: " + expirationDate + ")");
    }

    private String expirationDate;
}
