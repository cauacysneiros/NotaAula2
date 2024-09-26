package NotaAula2.Questao2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cálculo de corrida de Uber.");
        System.out.print("Digite a distância percorrida (km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo de espera (minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Digite a tarifa base: ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Digite o fator de demanda (1.0 para normal, >1.0 para horários de pico): ");
        double fatorDemanda = scanner.nextDouble();

        CorridaUber corrida = new CorridaUber(distancia, tempoEspera, tarifaBase, fatorDemanda);

        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}
