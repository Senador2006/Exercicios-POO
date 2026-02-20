package br.com.fiapride.model;

public class Paciente {
    public String nome;
    public int idade;
    public String sintoma;
    public String doenca;
    public boolean estado;

    public void exibeFicha(){
        System.out.println("========Ficha Técnica=======");
        System.out.println("- Nome: " + nome);
        System.out.println("- Idade: " + idade);
        System.out.println("- Sintoma: " + sintoma);
        System.out.println("- Doença: " + doenca);
        System.out.println("- Estado: " + estado);
        System.out.println("============================");
    }
}
