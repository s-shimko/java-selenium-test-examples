package s.shimko.belavia.dto;

import java.util.Objects;

public class Offer {

    private String price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return Objects.equals(price, offer.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "price='" + price + '\'' +
                '}';
    }
}
