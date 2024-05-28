# Conversor de Moedas

Bem-vindo ao Conversor de Moedas! Este sistema permite a conversão de valores entre diferentes moedas, utilizando taxas de câmbio atualizadas. As opções de conversão disponíveis incluem Dólar Americano (USD), Peso Argentino (ARS), Real Brasileiro (BRL) e Peso Colombiano (COP).

## Funcionalidades

- Converter Dólar Americano (USD) para Peso Argentino (ARS)
- Converter Peso Argentino (ARS) para Dólar Americano (USD)
- Converter Dólar Americano (USD) para Real Brasileiro (BRL)
- Converter Real Brasileiro (BRL) para Dólar Americano (USD)
- Converter Dólar Americano (USD) para Peso Colombiano (COP)
- Converter Peso Colombiano (COP) para Dólar Americano (USD)

## Como Usar

1. Ao iniciar o programa, você verá um menu com as opções de conversão disponíveis.
2. Escolha a opção desejada digitando o número correspondente.
3. Insira o valor que deseja converter.
4. O sistema exibirá o valor convertido para a moeda alvo.

## Exemplo de Uso

1. Menu Inicial

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

2. Escolha uma Opção

- Por exemplo, digite 1 para converter Dólar para Peso Argentino.

3. Digite o Valor a Ser Convertido

- Por exemplo, digite 100 para converter 100 Dólares.

4. Resultado

- O sistema exibirá algo como:

Valor 100 [USD] corresponde ao valor final de =>> 9030 [ARS]

## Estrutura do Código

- Main: Classe principal que contém o método main onde o programa inicia.
- Scanner: Utilizado para capturar a entrada do usuário.
- ConsultaCambio: Classe responsável por buscar as taxas de câmbio atualizadas.
- Moeda: Enum que representa as diferentes moedas.
- ConversionRate: Classe que armazena as taxas de câmbio retornadas pela consulta.

## Observações

- As taxas de câmbio são obtidas através da classe ConsultaCambio, que deve ser implementada para buscar as taxas de câmbio de uma fonte confiável.
- As opções do menu são representadas por números de 1 a 7, onde 7 é a opção para sair do programa.

Desenvolvido por Artur Henrique












