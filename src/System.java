import java.util.ArrayList;
import java.util.List;

/**
 * Created by micheal on 05/12/2017.
 */
public class System {
    public static void main(String[] args) {

        Transaction tran = new Transaction(0);

        List<Transaction> trans = new ArrayList<Transaction>();
        trans.add(tran);

        Account acc = new Account("1",trans);

        
    }
}
