//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //faturamento
        double faturamento = 0;

        //cria um objeto de cada tipo
        //todos sao "Assinatura", mesmo sendo planos diferentes
        Assinatura basico = new PlanoBasico("Rafael", 40);
        Assinatura anual = new PlanoAnual("Henrique", 40, 20);
        Assinatura familiar = new PlanoFamiliar("Helielson", 40, 3, 10);
        Assinatura estudante = new PlanoEstudante("Damaso", 40);

        //guarda os tres num array de assinaturas
        //utilizando generics, apenas objetos do tipo Assinatura sao guardados
        List<Assinatura> assinaturas = new ArrayList<>();
        assinaturas.add(basico);
        assinaturas.add(anual);
        assinaturas.add(familiar);
        assinaturas.add(estudante);

        //um unico laço trata os tres. Cada um responde do seu jeito. Isso é POLIMORFISMO
        //for aprimorado. Ler como "para cada a dentro de assinaturas"
        for (Assinatura a : assinaturas) {
            faturamento += a.calcularValorMensal();
            System.out.println("Cliente: " + a.getNomeCliente());
            System.out.printf("Valor mensal: R$ %.2f%n", a.calcularValorMensal());
            System.out.println("-----------------------------");
        }
        System.out.println("Número de assinaturas: " + assinaturas.size());
        System.out.printf("Faturamento: R$ %.2f%n", faturamento);
    }

}