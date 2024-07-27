package one.dio.gof.service;

import one.dio.gof.model.Customer;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de <b>Customer</b>.
 * Com isso, se necessário, podemos ter múltiplas implementações dessa mesma interface.
 *
 * @see one.dio.gof.model.Customer
 *
 * @author <a href="github.com/JohnAndante">JohnAndante</a>
 */

public interface CustomerService {
    Iterable<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void update(Long id, Customer customer);

    void delete(Long id);
}
