public class PlanoAnual extends Assinatura {

    // Um atributo novo que so o plano anual tem
    private double percentualDesconto;

    public PlanoAnual(String nomeCliente, double valorBase, double percentualDesconto) {
        super(nomeCliente, valorBase); // repassa o que é comum para o pai
        this.percentualDesconto = percentualDesconto; // guarda o que é so dele
    }

    @Override
    public double calcularValorMensal() {
        double desconto = getValorBase() * (percentualDesconto / 100);
        return getValorBase() - desconto;
    }
}
