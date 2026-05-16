package maratonajava.introducao;



public class tiposPrimitivos1 {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000L;
        long numeroGrande = 10000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShot = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "João Pedro";

        System.out.println("My age: "+age);
        System.out.println(verdadeiro);
        System.out.println("char "+caractere);
        System.out.println(nome);
    }
}
