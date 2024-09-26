package NotaAula2.Questao1;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("Bem-vindo ao Sistema Bancário");
        System.out.println("Digite o nome do titular da conta:");
        String titular = scanner.nextLine();

        System.out.println("Selecione o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            conta = new ContaCorrente(titular);
        } else if (escolha == 2) {
            System.out.println("Digite a taxa SELIC atual:");
            double selic = scanner.nextDouble();
            conta = new ContaPoupanca(titular, selic);
        }

        boolean sair = false;
        while (!sair) {
            System.out.println("\nMenu de opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (conta instanceof ContaCorrente) {
                System.out.println("3. Usar Cheque Especial");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("3. Calcular Rendimento");
            }
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do depósito:");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        ((ContaCorrente) conta).usarChequeEspecial();
                    } else if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).calcularRendimento();
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
