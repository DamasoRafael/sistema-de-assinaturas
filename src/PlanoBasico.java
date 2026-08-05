public class PlanoBasico extends Assinatura {

    //Construtor da filha. Ele só repassa os dados para o construtor do "pai"
    public PlanoBasico(String nomeCliente, double valorBase) {
        super(nomeCliente, valorBase);
    }

    //Sobrescreve o metodo da classe base
    //O plano basico pega o valor base, sem desconto, nem taxa
    @Override
    public double calcularValorMensal() {
        return getValorBase();
    }


}