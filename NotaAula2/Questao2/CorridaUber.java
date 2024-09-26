package NotaAula2.Questao2;

public class CorridaUber {
    private double distancia;
    private int tempoEspera;
    private double tarifaBase;
    private double fatorDemanda;

    public CorridaUber(double distancia, int tempoEspera, double tarifaBase, double fatorDemanda) {
        this.distancia = distancia;
        this.tempoEspera = tempoEspera;
        this.tarifaBase = tarifaBase;
        this.fatorDemanda = fatorDemanda;
    }

    public double calcularValorCorrida() {
        return (distancia * 2) + (tempoEspera * 0.5) + (tarifaBase * fatorDemanda);
    }

    public void exibirDetalhesCorrida() {
        double valorFinal = calcularValorCorrida();
        System.out.println("Detalhes da Corrida:");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Tempo de espera: " + tempoEspera + " minutos");
        System.out.println("Tarifa base: R$ " + tarifaBase);
        System.out.println("Fator de demanda: " + fatorDemanda);
        System.out.println("Valor final da corrida: R$ " + valorFinal);
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public int getTempoEspera() {
        return tempoEspera;
    }

    public void setTempoEspera(int tempoEspera) {
        this.tempoEspera = tempoEspera;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public double getFatorDemanda() {
        return fatorDemanda;
    }

    public void setFatorDemanda(double fatorDemanda) {
        this.fatorDemanda = fatorDemanda;
    }
}
