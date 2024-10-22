package lesson16StreamApi;

public class CoinForCachier {
    private int nominal;
    private String metalName;

    public CoinForCachier() {
    }

    public int getNominal() {
        return nominal;
    }

    public String getMetalName() {
        return metalName;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public void setMetalName(String metalName) {
        this.metalName = metalName;
    }

    @Override
    public String toString() {
        return "CoinForCashier{" +
                "nominal=" + nominal +
                ", metalName='" + metalName + '\'' +
                '}';
    }
}
