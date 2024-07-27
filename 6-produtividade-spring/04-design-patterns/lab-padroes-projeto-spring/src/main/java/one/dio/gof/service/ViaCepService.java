package one.dio.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;

import one.dio.gof.model.Address;

/** Client HTTP, criado via <b>OpenFeign</b>, para consumir a API <b>ViaCep</b>.
 *
 * @see <a href="https://viacep.com.br/">ViaCep</a>
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">OpenFeign</a>
 *
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws/")
public interface ViaCepService {

    @GetMapping("{cep}/json")
    Address getAddressByCep(@PathVariable String cep);

}
