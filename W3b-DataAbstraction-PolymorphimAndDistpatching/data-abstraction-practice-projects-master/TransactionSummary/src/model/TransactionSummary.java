package model;

import java.util.ArrayList;
import java.util.List;

public class TransactionSummary {

    private String name;
    private ArrayList<Transaction> transactions;

    public TransactionSummary(String name) {
        this.name = name;
        transactions = new ArrayList<>();
    }

    // getters
    public String getName() { return name; }
    public List<Transaction> getTransactions() { return transactions; }
    public int getNumTransactions() { return transactions.size(); }

    // REQUIRES: t is not already within transactions
    // MODIFIES: this
    // EFFECTS: adds the given transaction t to the list of transactions
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: computes the average amount of money spent on a transaction
    public double averageTransactionCost() {
        double totaltransaction = 0.0;
        int totalint = 0;

        for(int i = 0; i < transactions.size(); i++) {
            totaltransaction += transactions.get(i).getAmount();
        }
        totaltransaction /= getNumTransactions();
        return totalint = (int)totaltransaction;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS:  returns the average cost of all transactions of type specificType in this
    //           TransactionSummary
    public double specificTypeAverage(TransactionType specificType) {
        double totaltransactionType = 0;
        double count = 0.0;

        for(int i = 0; i < getTransactions().size(); i++) {
            if (transactions.get(i).getType().equals(specificType)) {
                totaltransactionType += transactions.get(i).getAmount();
                count++;
            }
        }
        return totaltransactionType / count;
    }

    // REQUIRES: transactions is non-empty
    // EFFECTS: returns the largest transaction (in terms of cost) in this TransactionSummary
    public Transaction largestTransaction() {
        Transaction largest = transactions.get(0);

        for(Transaction t: transactions) {
            if (t.getAmount() > largest.getAmount()) {
                largest = t;
            }
        }
        return largest;
    }

    // EFFECTS: returns true if the given transaction is contained within the list of transactions
    public boolean contains(Transaction t) {

        if(getTransactions().contains(t)) {
            return true;
        }
        return false;
    }


}
