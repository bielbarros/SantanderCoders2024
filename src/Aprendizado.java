

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;



    public class Aprendizado {

    public static void main(String[] args) {


            /* TIPOS DE VARIÁVEIS;

            String meuNome = Gabriel;
            byte idade = 123;
            short ano = 2024;
            int cep = 232532535; // se começar com 0 troque para string por conta da compilação.
            long cpf = 83535345376L; // se começar com '0' troque para string por conta da compilação.
            float pi = 3.14F;
            double salario = 1275.33;
            boolean = Valor lógico true/false, imutável após definido;
            char: simbolo, letra, contanto que seja 1 único caractere.


            // Para variavel imutável usar o ("final" tipoDaVariavel NOME_DA_VARIAVEL = valorAtribuido)

            // OPERADORES LÓGICOS;

            int soma = a + b;
            int subtracao = a - b;
            int multiplicacao = a * b;
            int divisao = a / b;



            // TABELA VERDADE

            Operador && (AND)

            true && true = true
            true && false = false
            false && true = false
            false && false = false  */

            boolean fimDeSemana = true;
            boolean fazendoSol = true;
            boolean vamosAPraia = fimDeSemana && fazendoSol;


            /* Operador || (OR)

            true || true = true
            true || false = true
            false || true = true
            false || false = false */

             // TESTE DE OPERADOR TRICENTENARIO

        boolean meuTeste = true;

        String mensagem = meuTeste ? "Funcionou!" : "Não funcionou!";

        System.out.println(mensagem);


        // ESTRUTUTURAS CONDICIONAIS

        // If-else

        int nota = 90;

            if (nota >= 70) {
                System.out.println("Aluno Aprovado!");
            }    else {
                System.out.println("Não aprovado!");
               }

            if (nota >= 80)
                System.out.println("Graduação A");
            else if (nota < 80 && > 70) {
                System.out.println("Graduação B");
            } else if (nota < 70 && > 60) {
                System.out.println("Graduação C");
            } else if (nota < 60 && > 0) {
                System.out.println("Graduação D");
            } else {

            }
                System.out.println("Nota inválida");

            // CÓDIGO DE FORMA MAIS SOFISTICADA:

        String graduacao;

            if (graduacao >= 80) {
                graduacao = "A";
            } else if (nota < 80 && > 70) {
                graduacao = "B";
            } else if (nota < 70 && > 60) {
                graduacao = "C";
            } else if (nota < 60 && > 0) {
                graduacao = "D";
            } else {
                graduacao = "";
            }

            switch (graduacao);
                case "A":
                case "B":
                    System.out.println("Aluno aprovado!");
                    break;
                case "C":
                case "D":
                    System.out.println("Não aprovado");
                    break;
                default:
                    System.out.println("Graduação inválida!");


                // MANIPULAÇÃO DE STRINGS E DATAS

                String nome = "Gabriel";
                System.out.println(nome.toUpperCase);
                System.out.println(nome.toLowerCase);
                System.out.println(nome.length);

                LocalDate hoje = LocalDate.now();
                Locale brasil = new Locale( "pt", "BR");

                System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
                String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
                String saudacao;
                LocalDateTime agora = LocalDateTime.now();
                if (agora.getHour() >= 0 && agora.getHour() < 12 ) {
                    saudacao = "bom dia";
                } else if (agora.getHour() >= 12 && agora.getHour < 18) {
                    saudacao = "boa tarde";
                } else if (agora.getHour() >= 18 && agora.getHour < 24) {
                    saudacao = "boa noite";
                } else {
                    saudacao = "Tenha um ótimo dia!";
                }

                System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());


                // LAÇOS NUMÉRICOS

                // para uma variável que inicia em 1, e vai até 10, mudando de 1 por 1, faça:
                for (int i = 1; 1 <= 10; i++) {
                    for (int j = 1; j <=10; j++) {
                        System.out.println(j + "x" + i + " = " + j * i);
                    }
                }


                // VETORES (ARRAYS)


                String[] letras = {"A", "B", "C", "D", "E"};
                    for (int i =0; i < letras.length; i++) {
                        System.out.println(letras[i]);
                    }


                    int [] numeros = {9, 10,12, 25, 2};
                    int maior = numeros[0];
                    int menor = numeros[0];
                    int media;

                    for (int i=0; i < numeros.length; i++) {
                        if (numeros[i] > maior) {
                            maior = numeros[i];
                        }
                    }

                    System.out.println("Maior: " + maior);
                    System.out.println("Menor: " + menor);
                    System.out.println("Media: " + media/numeros.length);


                    // MÉTODO

                    String nomeOriginal = "Gabriel";
                        saudacao(nomeOriginal);


                    int resultado = soma(a:2; b:3);
                        System.out.println(resultado);

        }
    }




                    public static void saudacao(String nomeParametro) {
                        System.out.println("Hello, " + nomeParametro);
                    }

                    public static int soma(int a, int b) {
                         return a + b;
                    }









}

