import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        //boas vindas e explicação apenas uma vez, fora da esteira
        System.out.println("Bem-vindo, " + nome + ". ");
        System.out.println();
        System.out.println("Esse é um sistema de assinatura. O valor base é 40 reais.");
        System.out.println("O anual tem 20% de desconto, o familiar é cobrado uma taxa por cada membro e o estudante tem direito a 50% de desconto");
        System.out.println();

        List<Assinatura> assinaturas = new ArrayList<>();
        boolean continuar = true;

        while (continuar) {

            int escolha = 0;

            while (escolha < 1 || escolha > 5) {
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

            if (escolha == 5) {
                continuar = false;
                System.out.println("Encerrando cadastro...");
            } else {
                Assinatura assinatura = null;

                switch (escolha) {
                    case 1:
                        assinatura = new PlanoBasico(nome, 40);
                        break;
                    case 2:
                        assinatura = new PlanoAnual(nome, 40, 20);
                        break;
                    case 3:
                        assinatura = new PlanoFamiliar(nome, 40, 3, 10);
                        break;
                    case 4:
                        assinatura = new PlanoEstudante(nome, 40);
                        break;
                }
                assinaturas.add(assinatura);
                System.out.println("Assinatura adicionada com sucesso.");
                System.out.println();
            }

        }
        System.out.println();
        System.out.println("========RESUMO=========");
        double faturamento = 0;
        for (Assinatura a : assinaturas) {
            double valor = a.calcularValorMensal();
            faturamento += valor;
            a.descricao();
            System.out.printf("Valor mensal: R$ %.2f%n", valor);
            System.out.println("-----------------------------");
        }
        System.out.println("Número de assinaturas: " + assinaturas.size());
        System.out.printf("Faturamento total: R$ %.2f%n", faturamento);

    }

}
