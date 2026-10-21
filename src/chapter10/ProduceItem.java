package chapter10;

public class ProduceItem extends GenericItem {
    private String expirationDate;

    public void setExpiration(String newDate) {
        expirationDate = newDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
