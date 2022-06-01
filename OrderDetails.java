package UML_ClassConvertToCodes;

import java.util.Objects;

public class OrderDetails {

    private int orderId;
    private int productId;
    private String productName;
    private int qty;
    private float itemCost;
    private float subtotal;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public float getItemCost() {
        return itemCost;
    }

    public void setItemCost(float itemCost) {
        this.itemCost = itemCost;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetails)) return false;
        OrderDetails that = (OrderDetails) o;
        return getOrderId() == that.getOrderId() && getProductId() == that.getProductId() && getQty() == that.getQty() && Float.compare(that.getItemCost(), getItemCost()) == 0 && Float.compare(that.getSubtotal(), getSubtotal()) == 0 && getProductName().equals(that.getProductName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderId(), getProductId(), getProductName(), getQty(), getItemCost(), getSubtotal());
    }
}
