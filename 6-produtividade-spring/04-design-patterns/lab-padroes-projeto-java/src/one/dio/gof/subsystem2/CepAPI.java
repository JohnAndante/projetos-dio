package one.dio.gof.subsystem2;

public class CepAPI {

    private static CepAPI instance = new CepAPI();

    private CepAPI() {
        super();
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String getCity(String cep) {
        return "São Paulo";
    }

    public String getState(String cep) {
        return "SP";
    }

}
