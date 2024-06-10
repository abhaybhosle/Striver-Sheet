package Programs;

import java.time.LocalDateTime;

public class Account {

    class Transaction {
        private double amount;
        private LocalDateTime timestamp;

        public Transaction(double amount) {
            this.amount = amount;
            this.timestamp = LocalDateTime.now();
        }

        public void printTransaction() {
            System.out.println("Transaction of " + amount + " at " + timestamp);
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        Account.Transaction a = account.new Transaction(240.54);
        a.printTransaction();
    }
}
