package one.dio.gof.model;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

/**
 * Classe que representa um cliente.
 *
 * Estrutura do <b>Customer</b>:
 * <ul>
 *      <li><code><b>id</b></code>: identificador do cliente. (Chave primária)</li>
 *      <li><code><b>name</b></code>: nome do cliente. (Obrigatório)</li>
 *      <li><code><b>address</b></code>: endereço do cliente. (Obrigatório)</li>
 * </ul>
 * 
 * @author <a href="github.com/JohnAndante">JohnAndante</a>
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

}
