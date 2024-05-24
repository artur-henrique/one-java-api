import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultaCambio consulta = new ConsultaCambio();

        int opcaoEscolhida = 0;
        String moedaBase = "";
        String moedaAlvo = "";

        while(opcaoEscolhida != 7) {
            System.out.println("""
                *****************************************************************
                Seja bem-vindo/a ao Conversor de Moeda =]

                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real Brasileiro
                4) Real Brasileiro =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Sair

                Escolha uma opção válida:

                *****************************************************************
                """);

            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    moedaBase = String.valueOf(Moeda.USD);
                    moedaAlvo = String.valueOf(Moeda.ARS);
                    break;
                case 2:
                    moedaBase = String.valueOf(Moeda.ARS);
                    moedaAlvo = String.valueOf(Moeda.USD);
                    break;
                case 3:
                    moedaBase = String.valueOf(Moeda.USD);
                    moedaAlvo = String.valueOf(Moeda.BRL);
                    break;
                case 4:
                    moedaBase = String.valueOf(Moeda.BRL);
                    moedaAlvo = String.valueOf(Moeda.USD);
                    break;
                case 5:
                    moedaBase = String.valueOf(Moeda.USD);
                    moedaAlvo = String.valueOf(Moeda.COP);
                    break;
                case 6:
                    moedaBase = String.valueOf(Moeda.COP);
                    moedaAlvo = String.valueOf(Moeda.USD);
                    break;

            }

            System.out.println("Digite o valor que deseja converter:\n");
            BigDecimal valorASerConvertido = leitura.nextBigDecimal();

            ConversionRate conversionRateList = consulta.buscaMoeda(moedaBase);
            BigDecimal conversionRate = conversionRateList.conversion_rates().get(moedaAlvo);

            BigDecimal valorFinal = valorASerConvertido.multiply(conversionRate);

            System.out.println("Valor " + valorASerConvertido +
                    " [" + moedaBase + "] corresponde ao valor final de =>> " +
                            valorFinal + " [" + moedaAlvo + "]"
                    );
        }
    }
}