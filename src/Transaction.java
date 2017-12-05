import java.text.SimpleDateFormat;
import java.util.Date;

public class Transaction {
    private final float amount;
    private final String timestamp;

    public Transaction(float amount) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String formattedDate = sdf.format(date);

        this.amount = amount;
        this.timestamp = formattedDate;
    }

    public float getAmount() {
        return this.amount;
    }
}
