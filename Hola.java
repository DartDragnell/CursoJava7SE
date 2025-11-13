import java.util.Scanner;

public class Hola{
    public static void main(String[] args) {
        //Hola Mundo
        System.out.println("Hola mundo");   
        
        //Tipos de datos

        /* 
        # Los valores primitivos no aceptan nulo
        # Los datos primitivos no tienen metodos
        */ 

        Integer var1;
        //int var1;

        var1 = null;

        System.out.println(var1);

        String cadena;
        cadena = "prueba de cadena";
        System.out.println(cadena.length());
        System.out.println(cadena);

        String numeroNueveNueve = "99";

        int x = Integer.parseInt(numeroNueveNueve) + 1;
        System.out.println(x); 

        char caracter;
        caracter = 'n';

        System.out.println(caracter);

        String texto  = "MitoCode";
        String texto2  = "Suscribir";


        char captura = texto.charAt(0);
        System.out.println(captura);

        int resultado = texto.compareTo(texto2);

        System.out.println(resultado);

        boolean condicion = true;

        if(condicion){
            System.out.println("Entra en el if"); 
        }else{
            System.out.println("Entra en el else"); 
        }

        int num1 = 20;
        int num2 = 10;
        int mayor;
        
        mayor = (num1 < num2) ? num2 : num1;

        System.out.println(mayor);


        //Scanner

        Scanner scan = new Scanner(System.in);

        System.out.println("Cual es tu nombre: ");
        String nombre = scan.next();
        System.out.println("Tu nombre es " + nombre);



        System.out.println("Ingresa un numero: ");
        int numeroIngresado = scan.nextInt();
        scan.close();
        System.out.println("El numero ingresado es " + numeroIngresado);

        int condicion_while = 5;

        while (condicion_while < 11) {
            System.out.println("Hola");
            condicion_while++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Adios");
            //Revisar video de ciclo for en youtube
            // https://www.youtube.com/watch?v=ABrzQYPC2as&list=PLvimn1Ins-42o8Ms1G2SuRloD01nnXn31&index=12
        }


    }

}
