import java.util.*;

public class Customer extends People implements IOperationCustomer {
    // Constructor


    public Customer(String name, String lastName, String ID, String address, String contact) {
        super(name, lastName, ID, address, contact);
    }

    public Customer() {

    }


    @Override
    public String getFullName() {

        return null;
    }

    @Override
    public void getList(ArrayList<Customer> customers) {
        System.out.println("Lista: "+ customers);
    }

    @Override
    public void makeSavingDeposits() {

    }

    @Override
    public void makeSavingsWithdrawals() {

    }

    @Override
    public void makeCurrentWithdrawals() {

    }

    @Override
    public void makeCreditCardPayments() {

    }

    @Override
    public void requestLoan() {

    }

    @Override
    public void makeLoanPayments() {

    }
}
