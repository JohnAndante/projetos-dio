package one.dio.gof.service.impl;

import org.springframework.stereotype.Service;

import one.dio.gof.model.Customer;
import one.dio.gof.service.CustomerService;

/**
 * Implementação da <b>Strategy</b> {@link CustomerService}, a qual pode ser
 * injetada pelo Spring (via {@link AutoWired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b> pelo Spring.
 *
 * @author <a href="github.com/JohnAndante">JohnAndante</a>
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Iterable<Customer> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll' in CustomerServiceImpl");
    }

    @Override
    public Customer findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById' in CustomerServiceImpl");
    }

    @Override
    public void save(Customer customer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save' in CustomerServiceImpl");
    }

    @Override
    public void update(Long id, Customer customer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update' in CustomerServiceImpl");
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete' in CustomerServiceImpl");
    }

}
