package one.dio.gof.subsystem1;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveCustomer(String name, String cep, String city, String state) {
        System.out.println("Customer saved in CRM: " + name + " - " + cep + " - " + city + " - " + state);
    }
}
