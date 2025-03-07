package my.project.entity;


public class Order {
    private int id;
    private String customerName;
    private double amount;
    private String status;
    private String date;

    public Order(int id, String customerName, double amount, String status, String date) {
        this.id = id;
        this.customerName = customerName;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Order{id=" + id + ", customer='" + customerName + "', amount=" + amount +
                ", status='" + status + "', date='" + date + "'}";
    }
}

