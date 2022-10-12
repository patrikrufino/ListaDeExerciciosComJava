package EstruturaSequencial.Helpers;

import java.math.BigDecimal;

public class Salario {
    /**
     * @param salario, horasTrabalhadas
     * @return BigDecimal
     * @name calcularSalario
     */

    public static BigDecimal calcularSalario(BigDecimal salario, BigDecimal horasTrabalhadas) {
        return salario.multiply(horasTrabalhadas);
    }

    /**
     * @param salarioBruto
     * @return BigDecimal
     * @name calcularInss
     */

    public static BigDecimal calcularInss(BigDecimal salarioBruto) {
        BigDecimal inss = new BigDecimal(0);
        BigDecimal porcentagemInss = new BigDecimal(0);
        BigDecimal valorInss = new BigDecimal(0);

        if (salarioBruto.compareTo(BigDecimal.valueOf(1000)) <= 0) {
            porcentagemInss = BigDecimal.valueOf(0.08);
        } else if (salarioBruto.compareTo(BigDecimal.valueOf(1500)) <= 0) {
            porcentagemInss = BigDecimal.valueOf(0.09);
        } else {
            porcentagemInss = BigDecimal.valueOf(0.1);
        }

        valorInss = salarioBruto.multiply(porcentagemInss);
        inss = inss.add(valorInss);

        return inss;
    }

    /**
     * @param salarioBruto
     * @return BigDecimal
     * @name calcularFgts
     */

    public static BigDecimal calcularFgts(BigDecimal salarioBruto) {
        BigDecimal fgts = new BigDecimal(0);
        BigDecimal porcentagemFgts = new BigDecimal("0.11");
        BigDecimal valorFgts = new BigDecimal(0);

        valorFgts = salarioBruto.multiply(porcentagemFgts);
        fgts = fgts.add(valorFgts);

        return fgts;

    }

    /**
     * @param salarioBruto
     * @return BigDecimal
     * @name calcularIr
     */

    public static BigDecimal calcularIr(BigDecimal salarioBruto) {
        BigDecimal ir = new BigDecimal(0);
        BigDecimal porcentagemIr = new BigDecimal(0);
        BigDecimal valorIr = new BigDecimal(0);

        if (salarioBruto.compareTo(BigDecimal.valueOf(3000)) <= 0) {
            porcentagemIr = BigDecimal.valueOf(0.05);
        } else if (salarioBruto.compareTo(BigDecimal.valueOf(6000)) <= 0) {
            porcentagemIr = BigDecimal.valueOf(0.07);
        } else {
            porcentagemIr = BigDecimal.valueOf(0.1);
        }

        valorIr = salarioBruto.multiply(porcentagemIr);
        ir = ir.add(valorIr);

        return ir;
    }

    /**
     * @param salarioBruto
     * @return BigDecimal
     * @name calcularSindicato
     */

    public static BigDecimal calcularSindicato(BigDecimal salarioBruto) {
        BigDecimal sindicato = new BigDecimal(0);
        BigDecimal porcentagemSindicato = new BigDecimal("0.05");
        BigDecimal valorSindicato = new BigDecimal(0);

        valorSindicato = salarioBruto.multiply(porcentagemSindicato);
        sindicato = sindicato.add(valorSindicato);

        return sindicato;
    }

    /**
     * @param salarioBruto, inss, ir, sindicato
     * @return BigDecimal
     * @name calcularSalarioLiquido
     */

    public static BigDecimal calcularSalarioLiquido(BigDecimal salarioBruto, BigDecimal inss, BigDecimal ir, BigDecimal sindicato) {
        BigDecimal salarioLiquido = new BigDecimal(0);

        salarioLiquido = salarioBruto.subtract(inss).subtract(ir).subtract(sindicato);

        return salarioLiquido;
    }
}
