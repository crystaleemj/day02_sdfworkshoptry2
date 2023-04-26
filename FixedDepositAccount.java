package sg.edu.nus.iss;

public class FixedDepositAccount extends BankAccount {
    float interest = 3.0f;
    int duration = 6;

    public FixedDepositAccount(String accountHolderName, float accountBalance) {
        super(accountHolderName, accountBalance);
    }
    public FixedDepositAccount(String accountHolderName, float accountBalance, float interest) {
        super(accountHolderName, accountBalance);
        this.interest = interest;
    }
    public FixedDepositAccount(String accountHolderName, float accountBalance, float interest, int duration) {
        super(accountHolderName, accountBalance);
        this.interest = interest;
        this.duration = duration;
    }

    public float getAccountBalance() {
        
        float fixedDepositBalance = super.getAccountBalance() + 3;
        return fixedDepositBalance;
    }

    public float getInterest() {
        return interest;
    }
    public void setInterest(float interest) {
        this.interest = interest;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "FixedDepositAccount [interest=" + interest + ", duration=" + duration + "]";
    }

    @Override
    public void deposit(int depositAmt){
    }

    @Override
    public void withdraw(int withdrawAmt){

    }
}
