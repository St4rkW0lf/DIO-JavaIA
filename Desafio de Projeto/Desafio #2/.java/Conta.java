public class Conta {
    private static int numeroContas = 0;
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.numeroConta = ++numeroContas;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
               "numeroConta=" + numeroConta +
               ", saldo=" + saldo +
               ", cliente=" + cliente +
               '}';
    }
}
