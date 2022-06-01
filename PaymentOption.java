package UML_ClassConvertToCodes;

import java.util.Objects;

public class PaymentOption extends Payment {

    double displayPaymentOption;

    private   int cashOnDelivery;
    private   int creditOrDebitCard;
    private  int EWallet;
    private  int onlinePayment;


    public PaymentOption(float amount, double displayPaymentOption, int cashOnDelivery, int creditOrDebitCard, int EWallet, int onlinePayment ) {
        super(amount);
        this.displayPaymentOption = displayPaymentOption;
        this.cashOnDelivery = cashOnDelivery;
        this.creditOrDebitCard = creditOrDebitCard;
        this.EWallet = EWallet;
        this.onlinePayment = onlinePayment;
    }

    public double getDisplayPaymentOption() {
        return displayPaymentOption;
    }

    public void setDisplayPaymentOption(double displayPaymentOption) {
        this.displayPaymentOption = displayPaymentOption;
    }

    public int getCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(int cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public int getCreditOrDebitCard() {
        return creditOrDebitCard;
    }

    public void setCreditOrDebitCard(int creditOrDebitCard) {
        this.creditOrDebitCard = creditOrDebitCard;
    }

    public int getEWallet() {
        return EWallet;
    }

    public void setEWallet(int eWallet) {
        this.EWallet = eWallet;
    }

    public int getOnlinePayment() {
        return onlinePayment;
    }

    public void setOnlinePayment(int onlinePayment) {
        this.onlinePayment = onlinePayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PaymentOption)) return false;
        if (!super.equals(o)) return false;
        PaymentOption that = (PaymentOption) o;
        return Double.compare(that.getDisplayPaymentOption(), getDisplayPaymentOption()) == 0 && getCashOnDelivery() == that.getCashOnDelivery() && getCreditOrDebitCard() == that.getCreditOrDebitCard() && getEWallet() == that.getEWallet() && getOnlinePayment() == that.getOnlinePayment();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDisplayPaymentOption(), getCashOnDelivery(), getCreditOrDebitCard(), getEWallet(), getOnlinePayment());
    }

    @Override
    public String toString() {
        return "PaymentOption{" +
                "displayPaymentOption=" + displayPaymentOption +
                ", cashOnDelivery=" + cashOnDelivery +
                ", creditOrDebitCard=" + creditOrDebitCard +
                ", EWallet=" + EWallet +
                ", onlinePayment=" + onlinePayment +
                '}';
    }
}
