package sg.edu.nus.iss;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    //all variables to be set to private
    //accountHolderName and accountNum should be read only properties
    //where once set, cannot be changed
    //accountNum should be randomly generated 
    private String accountHolderName = "";
    private String accountNum = "";
    private float accountBalance = 0.0f;
    private List<String> transactions = new ArrayList<>();
    private boolean accountIsClosed;
    private  LocalDateTime startDate;
    private  LocalDateTime endDate;

    
    //first constructor with accountHolderName
    //initialize bank balance to 0
    public BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = 0;
    }

    //second constructor with accountHolderName and accountBalance
    public BankAccount(String accountHolderName, float accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;

    }

    //create a deposit method for depositing money into bank acc
    //when successfully deposited, transaction should be updated 
    //when deposit value is negative or account is closed, throw IllegalArgumentException
    //when deposit value is correct, display "deposit _ amount at date & time"
    public void deposit(int depositAmt){
        if (depositAmt < 1 || accountIsClosed){
            throw new IllegalArgumentException("this transaction is not available!");
        } else {
            accountBalance = depositAmt + accountBalance;
            transactions.add("deposit " + depositAmt + " " + LocalDateTime.now());
        }
    }


    //create a withdraw method for withdrawing money into bank acc
    //when successfully withdrawn, transaction should be updated 
    //when deposit value is negative or account is closed, throw IllegalArgumentException
    //when deposit value is correct, display "withdraw _ amount at date & time" 
    public void withdraw(int withdrawAmt){
        if (withdrawAmt > accountBalance || accountIsClosed){
            throw new IllegalArgumentException("withdrawal not available!");
        } else {
            accountBalance = accountBalance - withdrawAmt;
            transactions.add("withdraw " + withdrawAmt + " " + LocalDateTime.now());
        }
    }
    

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public boolean getAccountIsClosed() {
        return accountIsClosed;
    }

    public void setAccountIsClosed(boolean accountIsClosed) {
        this.accountIsClosed = accountIsClosed;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "BankAccount [accountHolderName=" + accountHolderName + ", accountNum=" + accountNum
                + ", accountBalance=" + accountBalance + ", transactions=" + transactions + ", accountIsClosed="
                + accountIsClosed + ", startDate=" + startDate + ", endDate=" + endDate + "]";
    }


    
    


    
}
