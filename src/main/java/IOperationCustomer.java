import java.util.ArrayList;

public interface IOperationCustomer {
    public String getFullName();
    public void getList(ArrayList<Customer> customers);
    public void makeSavingDeposits();
    public void makeSavingsWithdrawals();
    public void makeCurrentWithdrawals();
    public void makeCreditCardPayments();
    public void requestLoan();
    public void makeLoanPayments();
}
