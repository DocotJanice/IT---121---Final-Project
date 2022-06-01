package UML_ClassConvertToCodes;

import java.util.Objects;

public class Payment {


    //attributes
    private float amount;

    // methods

    public Payment(float amount){
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;
        Payment payment = (Payment) o;
        return Float.compare(payment.getAmount(), getAmount()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAmount());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "amount=" + amount +
                '}';
    }
}
