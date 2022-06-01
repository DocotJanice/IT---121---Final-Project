package UML_ClassConvertToCodes;


import java.util.Objects;

public class ShoppingCart {

    // attributes
    private int cartId;
    private int productId;
    private int qty;
    private int dateAdded;



    public void ShoppingCart(int cartId, int productId, int qty, int dateAdded){
        this.cartId = cartId;
        this.productId = productId;
        this.qty = qty;
        this.dateAdded = dateAdded;

    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoppingCart)) return false;
        ShoppingCart that = (ShoppingCart) o;
        return getCartId() == that.getCartId() && getProductId() == that.getProductId() && getQty() == that.getQty() && getDateAdded() == that.getDateAdded();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCartId(), getProductId(), getQty(), getDateAdded());
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", productId=" + productId +
                ", qty=" + qty +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
