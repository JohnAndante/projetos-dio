public class IV_Metodos {

    public static void main(String[] args) {

    }

    // * Métodos ////////////////////////////////////////////////
    
    public double somar(int num1, int num2) {
        // LOGICA - FINALIDADE DO MÉTODO
        return num1 + num2;
    }

    public void imprimir(String texto) {
        // LOGICA - FINALIDADE DO MÉTODO
        // AQUI NÃO PRECISA DO RETUIRN
        System.out.println(texto);
    }

    public double dividir(int dividento, int divisor) throws Exception {
        // LOGICA - FINALIDADE DO MÉTODO
        if (divisor == 0) {
            throw new Exception("Divisão por zero");
        }
        return dividento / divisor;
    }

    private void metodoPrivado() {
        // NÃO SERÁ VISÍVEL FORA DESTA CLASSE
    }

    public void validar() {
        // deveria retornar um boolean
    }

    public void calcularEnviar() {
        // deve representar apenas uma responsabilidade
    }

}
