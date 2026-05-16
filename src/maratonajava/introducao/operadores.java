package maratonajava.introducao;

public class operadores {
    public static void main(String[] args) {
        // + - / *
       int numero1 = 10;
       int numero2 = 20;
       double resultado = numero1 - numero2;
       System.out.println(numero1 + numero2 - resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez"+isDezDiferenteDez);

        // && (and) || (or) !
        int idade = 28;
        float salario = 5000;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4500;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 4500;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaConrrente = 200;
        double valorTotalContaPoupança = 10000;
        float valorPlayCinco = 5000;
        boolean isPlayCincoCompravel = valorTotalContaConrrente > valorPlayCinco || valorTotalContaPoupança > valorPlayCinco;

        System.out.println("isPlayCincoCompravel "+isPlayCincoCompravel);


        // = += -= *= /= %=
        double bonus = 1900;
        bonus += 1000;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int contador = 1;
        contador++;
        System.out.println(contador);


    }
}
