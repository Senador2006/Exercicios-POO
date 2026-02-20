package br.com.fiapride.main;
import br.com.fiapride.model.Paciente;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        // Paciente 1
        Paciente paciente1 = new Paciente();
        paciente1.nome = "Thiago";
        paciente1.idade = 19;
        paciente1.sintoma = "dor no coração";
        paciente1.doenca = "amar demais";

        //Paciente 2
        Paciente paciente2 = new Paciente();
        paciente2.nome = leitura.nextLine();
        paciente2.idade = Integer.parseInt(leitura.nextLine());
        paciente2.sintoma = leitura.nextLine();
        paciente2.doenca = leitura.nextLine();

        paciente1.exibeFicha();
        paciente2.exibeFicha();

    }
}