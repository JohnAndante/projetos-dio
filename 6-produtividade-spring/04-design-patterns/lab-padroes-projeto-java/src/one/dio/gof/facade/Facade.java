package one.dio.gof.facade;

import one.dio.gof.subsystem1.CrmService;
import one.dio.gof.subsystem2.CepAPI;

public class Facade {

    public void migrateCustomer(String name, String cep) {
        String city = CepAPI.getInstance().getCity(cep);
        String state = CepAPI.getInstance().getState(cep);

        CrmService.saveCustomer(name, cep, city, state);
    }

}
