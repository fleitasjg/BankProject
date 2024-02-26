import java.util.*;

public class Administrator extends People implements IOperationAdministrator {
    // Constructor
    // Este es un comentario
    public Administrator(String bankName, String address, String contact,
                         ArrayList<Customer> clients, ArrayList<Loan> loans,
                         ArrayList<SavingsAccount> savingsAccount, ArrayList<CurrentAccount> currentsAccount,
                         ArrayList<DebitCard> debitsCard,
                         String name, String lastName, String ID, String address1, String contact1) {
        super(bankName, address, contact, clients, loans, savingsAccount, currentsAccount, debitsCard, name, lastName, ID, address1, contact1);
    }

    public void performAdministratorOperation() {
        // Implementa la lógica específica para operaciones de administrador
        System.out.println("Performing administrator operation");
    }

    @Override
    public void registerCustomers() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\nIndique su nombre:");
        String name = entrada.nextLine();
        System.out.println("\nIndique su apellido:");
        String lastName = entrada.nextLine();
        System.out.println("\nIndique su ID:");
        String id = entrada.nextLine();
        System.out.println("\nIndique su direccion:");
        String address = entrada.nextLine();
        System.out.println("\nIndique su numero de contacto:");
        String contact = entrada.nextLine();
    }

    @Override
    public void removeCustomers() {

    }

    @Override
    public void createSavingsAccount() {

    }

    @Override
    public void createCurrentAccount() {

    }

    @Override
    public void createDebitCard() {

    }

    @Override
    public void createCreditCard() {

    }

    @Override
    public void createLoan() {

    }
}
