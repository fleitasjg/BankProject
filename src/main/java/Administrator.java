import java.util.*;

public class Administrator extends People implements IOperationAdministrator {
    // Constructor


    public Administrator() {
        super();
    }

    public Administrator(String name, String lastName, String ID, String address, String contact) {
        super(name, lastName, ID, address, contact);
    }

    @Override
    public void registerCustomers() {
        ArrayList<Customer> clients = new ArrayList<>();
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
        // Create a new Person object
        Customer cli = new Customer(name,lastName,id,address,contact);
        clients.add(cli);
        cli.getList(clients);
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
