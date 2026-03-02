package br.com.fiapride.model;

public class Passageiro {
    // Atributos
    private String nome;
    private String cpf;
    private int idade;
    private double saldo;

    // Construtor
    public Passageiro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = 0;
        this.saldo = 0.0;
    }

    // Método: Adiciona um valor ao saldo
    public void adicionarSaldo(double valor) {

        if (valor <= 0) {
            System.out.println("Erro: O valor de recarga deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
        System.out.println("Recarga realizada. Novo saldo: " + this.saldo);
    }

    public void pagarViagem(double custo) {

        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
