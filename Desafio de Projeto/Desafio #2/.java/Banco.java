import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes;
    private List<Conta> contas;

    public Banco() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente);
    }

    public void criarConta(Cliente cliente) {
        Conta conta = new Conta(cliente);
        contas.add(conta);
        System.out.println("Conta criada: " + conta);
    }

    public Conta encontrarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }

    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        banco.criarConta(cliente1);
        banco.criarConta(cliente2);

        Conta contaJoao = banco.encontrarConta(1);
        Conta contaMaria = banco.encontrarConta(2);

        if (contaJoao != null) {
            contaJoao.depositar(500);
            contaJoao.sacar(150);
        }

        if (contaMaria != null) {
            contaMaria.depositar(1000);
            contaMaria.sacar(200);
        }

        banco.listarContas();
    }
}
