package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        // * Para este primer ejercicio tendréis que realizar lo siguiente:
        // *Crea un proyecto de Java desde 0
        // *Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
        // *Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
        // *Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.

        //Tipos de datos:
        //Texto
        System.out.println("*******Tipos de datos caracteres*******");

        String texto = "Esto es una cadena de caracteres";
        System.out.println("\"Tipo de dato String\" \n\t"+texto);
        System.out.println();
        char caracter = 'A';
        System.out.println("\"Tipo de dato Char\"\n\t"+caracter);
        //Numéricos
        System.out.println("********Tipos de datos numéricos**********");

        byte numeroByte = 100;
        System.out.println();
        System.out.println("\"Tipo de dato byte\"\n\t"+numeroByte);

        System.out.println();
        short numerosShort = 32000;
        System.out.println("\"Tipo de dato short\"\n\t"+numerosShort);

        System.out.println("Tipo de dato int");
        int velocidadLuz = 299792458;
        System.out.println("\tVelocidad de la luz: "+velocidadLuz);

        System.out.println("Tipo de dato Long \n");
        long anosLuz = velocidadLuz * 365L;
        System.out.println("\tAños Luz: "+anosLuz);

        System.out.println("Tipo de dato Float\n");
        float pi = 3.1416f;
        System.out.println("\tNúmero Pi: "+pi);

        System.out.println("Tipo de dato Double\n");
        double numeroDouble = 2.718281828459045235360;
        System.out.println("\tNúmero Double: "+numeroDouble);




    }
}