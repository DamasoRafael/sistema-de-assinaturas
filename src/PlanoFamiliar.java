public class PlanoFamiliar extends Assinatura {
    private int membrosExtra;
    private double taxaPorMembro;

    public PlanoFamiliar(String nomeCliente, double valorBase, int membrosExtra, double taxaPorMembro) {
        super(nomeCliente, valorBase);
        this.membrosExtra = membrosExtra;
        this.taxaPorMembro = taxaPorMembro;
    }

    @Override
    public double calcularValorMensal() {
        return getValorBase() + (membrosExtra * taxaPorMembro);
    }
}
