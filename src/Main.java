import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc2.nextLine();

        int escolha = 0; //botei 0 pra forçar um valor e entrar no laço

        while (escolha < 1 || escolha > 5) {
            System.out.println("Bem-vindo, " + nome + ". ");
            System.out.println();
            System.out.println("Esse é um sistema de assinatura. O valor base é 40 reais.");
            System.out.println("O anual tem 20% de desconto, o familiar é cobrado uma taxa por cada membro e o estudante tem direito a 50% de desconto");
            System.out.println();
            System.out.println("Por favor, escolha um plano: ");
            System.out.println("1 - Básico");
            System.out.println("2 - Anual");
            System.out.println("3 - Familiar");
            System.out.println("4 - Estudante");
            System.out.println("5 - Sair do Menu");

            escolha = sc.nextInt();

            if (escolha < 1 || escolha > 5) {
                System.out.println("Opção inválida! Digite um número de 1 a 5.");
            }
        }


        Assinatura assinatura = null;

        switch (escolha) {
            case 1:
                assinatura = new PlanoBasico("Cliente", 40);
                break;
            case 2:
                assinatura = new PlanoAnual("Cliente", 40, 20);
                break;
            case 3:
                assinatura = new PlanoFamiliar("Cliente", 40, 3, 10);
                break;
            case 4:
                assinatura = new PlanoEstudante("Cliente", 40);
                break;
            case 5:
                System.out.println("Saindo...");
                break;
            default:
                break;
        }

        if (assinatura != null) {
            assinatura.descricao();
            System.out.printf("Valor mensal: R$ %.2f%n", assinatura.calcularValorMensal());
        }

    }

}










        /*
        //faturamento
        double faturamento = 0;

        //cria um objeto de cada tipo
        //todos sao "Assinatura", mesmo sendo planos diferentes
        Assinatura basico = new PlanoBasico("Rafael", 40);
        Assinatura anual = new PlanoAnual("Henrique", 40, 20);
        Assinatura familiar = new PlanoFamiliar("Helielson", 40, 3, 10);
        Assinatura estudante = new PlanoEstudante("Damaso", 40);
        Assinatura estudante2 = new PlanoEstudante("Louisiana", 40);

        //guarda num array de assinaturas
        //utilizando generics, apenas objetos do tipo Assinatura sao guardados
        List<Assinatura> assinaturas = new ArrayList<>();
        assinaturas.add(basico);
        assinaturas.add(anual);
        assinaturas.add(familiar);
        assinaturas.add(estudante);
        assinaturas.add(estudante2);

        //um unico laço trata. Cada um responde do seu jeito. Isso é POLIMORFISMO
        //for aprimorado. Ler como "para cada a dentro de assinaturas"
        for (Assinatura a : assinaturas) {
            faturamento += a.calcularValorMensal();
            //System.out.println("Cliente: " + a.getNomeCliente());
            a.descricao();
            System.out.printf("Valor mensal: R$ %.2f%n", a.calcularValorMensal());
            System.out.println("-----------------------------");
        }
        System.out.println("Número de assinaturas: " + assinaturas.size());
        System.out.printf("Faturamento: R$ %.2f%n", faturamento);

         */
