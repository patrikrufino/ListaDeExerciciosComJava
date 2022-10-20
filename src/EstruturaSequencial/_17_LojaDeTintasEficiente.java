package EstruturaSequencial;

public class _17_LojaDeTintasEficiente {
    public static void main(String[] args) {

        // Variáveis
        double area = 54;
        double litros = area / 6;
        double latas = Math.ceil(litros / 18);
        double precoLatas = latas * 80;
        double galoes = Math.ceil(litros / 3.6);
        double precoGaloes = galoes * 25;
        double precoLatasGaloes = (Math.ceil(latas) * 80) + (Math.ceil(galoes) * 25);

        // Saída
        System.out.println("Você precisará de " + latas + " latas de tinta.");
        System.out.println("O preço total será de R$ " + precoLatas);
        System.out.println("Você precisará de " + galoes + " galões de tinta.");
        System.out.println("O preço total será de R$ " + precoGaloes);
        System.out.println("Você precisará de " + latas + " latas de tinta e " + galoes + " galões de tinta.");
        System.out.println("O preço total será de R$ " + precoLatasGaloes);


    }
}