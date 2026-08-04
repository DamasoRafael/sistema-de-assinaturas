public class Assinatura {
    // Atributos privados: ninguem de fora mexe direto neles (encapsulamento)
    private String nomeCliente;
    private double valorBase;

    // Construtor: é chamado quando faço "new Assinatura(..)"
    // Serve para dar os valores iniciais ao objeto no momento em que ele nasce
    public Assinatura(String nomeCliente, double valorBase) {
        this.nomeCliente = nomeCliente;
        this.valorBase = valorBase;
    }

    // O metodo que toda assinatura tem. Na classe base, o valor é so o valor base
    // As filhas vão sobrescrever esse metodo com regras diferentes
    public double calcularValorMensal() {
        return valorBase;
    }

    // Getters: a porta de entrada controlada para ler os atributos privados
    public String getNomeCliente() {
        return  nomeCliente;
    }

    public double getValorBase() {
        return  valorBase;
    }
    /*
    public static void descricao(){
        System.out.println("Assinatura de: " + );
    }
    */
}
