package sg.edu.nus.iss;

public class App 
{
    public static void main( String[] args )
    {
        BankAccount b1 = new BankAccount("Crystal", 1000);
        FixedDepositAccount b2 = new FixedDepositAccount("mj", 300);
        System.out.println(b2.getAccountBalance());
    }
}
