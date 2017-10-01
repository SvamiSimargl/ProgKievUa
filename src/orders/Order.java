package orders;

import java.time.LocalDateTime;

public class Order {
    private String id;
    private LocalDateTime createdDate;
    private long orderPrice;
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;


    public String getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public long getOrderPrice() {
        return orderPrice;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void setId(String id) {
        this.id = id; }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderPrice(long orderPrice) {
        this.orderPrice = orderPrice;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", createdDate=" + createdDate +
                ", orderPrice=" + orderPrice +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
