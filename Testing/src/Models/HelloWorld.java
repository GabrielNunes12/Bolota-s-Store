package Models;

public class HelloWorld {
    public static void main(String[] args) {
        int y = 23;
        double x = 21.0004;
        String nomePrimario = "Gabriel";
        System.out.println("Hello world");
        //printando o valor de y
        System.out.println(y);
        //printando o valor de x
        System.out.printf("%.2f%n",x);
        System.out.printf("o valor é = %f , muito daora é daora %n", x); // o valor é = 21.0004, muito daora é daora
        System.out.printf("o valor é = %s , muito daora é daora %n", nomePrimario); // o valor é = 21.0004, muito daora é daora
    }
}
