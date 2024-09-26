package NotaAula2.Questao1;

public class ContaCorrente extends ContaBancaria{
    private double chequeEspecial = 1000.00;

    public ContaCorrente(String titular) {
        super(titular);
    }

    
    public void sacar(double valor) {
        if (valor > 0 && saldo + chequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo e cheque especial insuficientes!");
        }
    }

    public void usarChequeEspecial() {
        if (saldo < 0) {
            System.out.println("Você está utilizando R$ " + Math.abs(saldo) + " do cheque especial.");
        } else {
            System.out.println("Você não está utilizando o cheque especial.");
        }
    }
}
