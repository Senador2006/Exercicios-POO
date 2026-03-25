package br.com.fiapride.model;
import java.util.Objects;

public class Paciente {
    private String nome;
    private int idade;
    private String sintoma;
    private String doenca;
    private boolean estado;

    public Paciente(String nome, int idade, String sintoma, String doenca, boolean estado) {
        this.nome = Objects.requireNonNull(nome, "Nome não pode ser nulo");
        if (idade <= 0){
            System.out.println("A idade nao pode ser menor ou igual a zero");
        }
        this.idade = idade;
        this.sintoma = Objects.requireNonNull(sintoma, "Nome não pode ser nulo");
        this.doenca = Objects.requireNonNull(doenca, "Nome não pode ser nulo");
        this.estado = estado;
    }

    private String validarTexto(String valor) {
        return (valor == null || valor.isBlank())
                ? "Não obtido ou inválido"
                : valor;
    }

    public void exibeFicha(){
        System.out.println("========Ficha Técnica=======");
        System.out.println("- Nome: " + validarTexto(nome));
        if (idade <= 0){
            System.out.println("- Idade: Não obtida ou invalida");
        } else{
            System.out.println("- Idade: " + idade);
        }

        System.out.println("- Sintoma: " + validarTexto(sintoma));
        System.out.println("- Doença: " + validarTexto(doenca));
        System.out.println("- Estado: " + estado);
        System.out.println("============================");
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSintoma() {
        return sintoma;
    }

    private void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getDoenca() {
        return doenca;
    }

    private void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public boolean isEstado() {
        return estado;
    }

    private void setEstado(boolean estado) {
        this.estado = estado;
    }
}
