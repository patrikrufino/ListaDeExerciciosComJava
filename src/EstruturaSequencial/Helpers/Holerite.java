package EstruturaSequencial.Helpers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import static EstruturaSequencial.Helpers.Salario.*;

public class Holerite {

    public static String geraHolerite(BigDecimal salarioPorHora, BigDecimal horasTrabalhadas) {

        BigDecimal salarioBruto = calcularSalario(salarioPorHora, horasTrabalhadas);

        BigDecimal inss = calcularInss(salarioBruto);

        BigDecimal fgts = calcularFgts(salarioBruto);

        BigDecimal ir = calcularIr(salarioBruto);

        BigDecimal sindicato = calcularSindicato(salarioBruto);

        BigDecimal salarioLiquido = calcularSalarioLiquido(salarioBruto, inss, ir, sindicato);

        return "Salário Bruto: " + salarioBruto + "\n" +
                "(-) IR: " + ir + "\n" +
                "(-) INSS: " + inss + "\n" +
                "FGTS: " + fgts + "\n" +
                "Sindicato: " + sindicato + "\n" +
                "Salário Liquido: " + salarioLiquido;
    }

    /**
     * @param salarioPorHora, HorasTrabalhadas
     * @return void
     * @name geraHoleritetxt
     */

    public static void geraHoleritetxt(BigDecimal salarioPorHora, BigDecimal horasTrabalhadas) {
        BigDecimal salarioBruto = calcularSalario(salarioPorHora, horasTrabalhadas);
        BigDecimal inss = calcularInss(salarioBruto);
        BigDecimal fgts = calcularFgts(salarioBruto);
        BigDecimal ir = calcularIr(salarioBruto);
        BigDecimal sindicato = calcularSindicato(salarioBruto);
        BigDecimal salarioLiquido = calcularSalarioLiquido(salarioBruto, inss, ir, sindicato);

        // Cria um arquivo chamado "Holerite.txt" e escreve o holerite nele
        try {
            FileWriter arq = new FileWriter("Holerite.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("Salário Bruto: " + salarioBruto + "\n" +
                    "(-) IR: " + ir + "\n" +
                    "(-) INSS: " + inss + "\n" +
                    "FGTS: " + fgts + "\n" +
                    "Sindicato: " + sindicato + "\n" +
                    "Salário Liquido: " + salarioLiquido);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

    }
}
