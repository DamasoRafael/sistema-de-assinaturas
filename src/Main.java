//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //cria um objeto de cada tipo
        //todos sao "Assinatura", mesmo sendo planos diferentes
        Assinatura basico = new PlanoBasico("Rafael", 40);
        Assinatura anual = new PlanoAnual("Henrique", 40, 20);
        Assinatura familiar = new PlanoFamiliar("Helielson", 40, 3, 10);
        Assinatura estudante = new PlanoEstudante("Damaso", 40);

        //guarda os tres num array de assinaturas
        Assinatura[] assinaturas = { basico, anual, familiar, estudante };

        //um unico laço trata os tres. Cada um responde do seu jeito. Isso é POLIMORFISMO
        //for aprimorado. Ler como "para cada a dentro de assinaturas"
        for (Assinatura a : assinaturas) {
            System.out.println("Cliente: " + a.getNomeCliente());
            System.out.printf("Valor mensal: R$ %.2f%n", a.calcularValorMensal());
            System.out.println("-----------------------------");
        }

    }

}