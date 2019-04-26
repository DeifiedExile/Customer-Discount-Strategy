package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    private DiscountStrategy discountStrategy;

    public Customer(String customerName, double billAmount, DiscountStrategy ds) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.discountStrategy = ds;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        double tempBill;
        tempBill = discountStrategy.applyDiscount(billAmount);
        return tempBill;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    public void setDiscountStrategry(DiscountStrategy discountStrategy)
    {
        this.discountStrategy = discountStrategy;
    }

    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountStrategy.getDescription()
                + '}';
    }
}
