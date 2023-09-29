import java.util.Date;

class Cliente {
    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

class Conta {
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroDaConta, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.cliente = cliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void transfere(Date data, double valor, Conta destino) {
        // Lógica para realizar uma transferência para a Conta destino na data especificada
    }

    public double consultaSaldo() {
        return saldo;
    }
}

class ContaCorrente extends Conta {
    public ContaCorrente(int numeroDaConta, Cliente cliente) {
        super(numeroDaConta, cliente);
        // Implementação específica para Conta Corrente
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(int numeroDaConta, Cliente cliente) {
        super(numeroDaConta, cliente);
        // Implementação específica para Conta Poupança
    }
}
