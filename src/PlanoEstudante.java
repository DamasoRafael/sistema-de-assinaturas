public class PlanoEstudante extends Assinatura {

    public PlanoEstudante(String nomeCliente, double valorBase) {
        super(nomeCliente, valorBase);
    }

    @Override
    public double calcularValorMensal() {
        return (getValorBase() / 2);
    }
}
