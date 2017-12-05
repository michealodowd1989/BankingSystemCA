public class Transaction {
    private final float amount;
    private final long timestamp;

    public Transaction(float amount) {
        this.amount = amount;
        this.timestamp = System.currentTimeMillis();
    }

    public float getAmount() {
        return this.amount;
    }
}
