package UML_ClassConvertToCodes;

public class ShippingInfo {

    private int shippingId;
    private int shippingCost;

    public ShippingInfo(int shippingId, int shippingCost){
        this.shippingId = shippingId;
        this.shippingCost = shippingCost;
    }

    public void setShippingId(int shippingId){
        this.shippingId = shippingId;
    }

    public int getShippingId(){
        return shippingId;
    }

    public void updateShippingInfo(){

    }
}
