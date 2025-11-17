import java.util.Scanner;

public class Hola{

    public static void main(String[] args) {
        //** Clase Hola Mundo ***/
        System.out.println("Hola mundo");   
        
        //** Clase Tipos de datos ***/

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


        //** Clase Scanner ***/

        // Scanner scan = new Scanner(System.in);

        // System.out.println("Cual es tu nombre: ");
        // String nombre = scan.next();
        // System.out.println("Tu nombre es " + nombre);



        // System.out.println("Ingresa un numero: ");
        // int numeroIngresado = scan.nextInt();
        // scan.close();
        // System.out.println("El numero ingresado es " + numeroIngresado);

        //** Clase while ***/

        // int condicion_while = 5;

        // while (condicion_while < 11) {
        //     System.out.println("Hola");
        //     condicion_while++;
        // }

        //** Clase for ***/


        // for (int i = 0; i < 5; i++) {

        //     if(i == 2){
        //         //break;
        //         continue;
        //     }

        //     System.out.println(i);
            
        // }

        // String[] array = {"Facebook","Youtube","Twitter","Instagram","Whatsapp"}; 

        // for (int i = 0; i < array.length; i++) {
        //     System.out.println(array[i]);
        // }

        // for (String valor_array : array) {
        //     System.out.println(valor_array);
        // }


        //** Clase do while ***/

        // String  opcion;
        // Scanner sc = new Scanner(System.in);
        // do {
        //     System.out.println("Ingrese mitocode");
        //     opcion = sc.next();
        // } while (!opcion.equals("mitocode"));
        // sc.close();

        //** Clase Vectores ***/

        // System.out.println("Ingrese tamaño del vector: ");
        // Scanner sc = new Scanner(System.in);
        // int tamano = sc.nextInt();
        

        // String[] vector = new String[tamano];

        // for (int i = 0; i < vector.length; i++) {

        //     System.out.println("Ingrese contenido para la posicion del vector " + i + " : ");
        //     vector[i] = sc.next();    
        // }

        // sc.close();

        // for (String valor_vector : vector) {
        //     System.out.println(valor_vector);
        // }

        //** Clase Vectores Paralelos ***/
        
        // Scanner sc = new Scanner(System.in);
        // String[] nombres = new String[3];
        // int[] edades = new int[3];

        // for (int i = 0; i < 3; i++) {

        //     System.out.println("Ingrese nombre: ");
        //     nombres[i] = sc.next();

        //     System.out.println("Ingrese edad: ");
        //     edades[i] = sc.nextInt();
            
        // }
        // sc.close();

        // for (int i = 0; i < 3; i++) {
        //     System.out.println("Nombre ingresado: " + nombres[i] + " edad ingresada: " + edades[i]);
        // }

        //** Clase Vectores mayor o menor elemento ***/

        // Scanner sc = new Scanner(System.in);

        // int[] edades = new int[3];
        // String[] nombres = new String[3];

        // int edad_mayor = edades[0];
        // int posicion = 0;

        // for (int i = 0; i < 3; i++) {

        //     System.out.println("Ingrese nombre: ");
        //     nombres[i] = sc.next();

        //     System.out.println("Ingrese edad: ");
        //     edades[i] = sc.nextInt();
            
        // }

        // for (int i = 0; i < 3; i++) {

        //     if (edades[i] > edad_mayor){
        //         edad_mayor = edades[i];
        //         posicion = i;
        //     }
            
        // }

        // System.out.println("El edad mayor es : " + edad_mayor);
        // System.out.println("El nombre es : " + nombres[posicion]);

        //** Clase Vectores ordenamiento ***/

        // Scanner sc = new Scanner(System.in);

        // int[] lst_num_desordenados = new int[8];

        // for (int i = 0; i < 8; i++) {
        //     System.out.println("Ingrese un numero para el vector [" + i + "] : ");

        //     lst_num_desordenados[i] = sc.nextInt();
        // }

        // System.out.println("------------------------------");

        // int aux;

        // for (int i = 0; i < 7; i++) {
        //     for (int j = 0; j < 7 - i; j++) {
        //         if (lst_num_desordenados[j] > lst_num_desordenados[j + 1])
        //         {
        //             aux = lst_num_desordenados[j];
        //             lst_num_desordenados[j] = lst_num_desordenados[j + 1];
        //             lst_num_desordenados[j + 1] = aux;
        //         }
        //     }
        // }

        // for (Integer valor : lst_num_desordenados) {
        //     System.out.println("valor: " + valor);    
        // }
        

        // sc.close();

        //** Clase Matrices ***/

        // Scanner sc = new Scanner(System.in);
        // int[][] numerosMatrices = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {
        //         System.out.println("Ingrese elemento para la posicion ["+ i + "]["+j+"] : ");
        //         numerosMatrices[i][j]  =sc.nextInt();
        //     }
        // }

        // for (int i = 0; i < numerosMatrices.length; i++) {
        //     for (int j = 0; j < numerosMatrices.length; j++) {
        //         if(i == j){
        //             System.out.print(numerosMatrices[i][j]);
        //         }else{
        //             System.out.print(0);
        //         }
        //         //System.out.println("Numero ingresado para la posicion ["+ i + "]["+j+"] : " + numerosMatrices[i][j]);
        //         //System.out.print(numerosMatrices[i][j] + "\t");
        //     }
        //     System.out.print("\n");
        // }

        // sc.close();

        //** Clase Switch ***/

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingrese nomnbre:");
        // String rsSwitch = sc.next();

        // switch (rsSwitch) {
        //     case "mito":
        //     case "code":
        //         System.out.println("Hola " + rsSwitch);   
        //         break;
        //     default:
        //         System.out.println("Hola por defecto");   
        //         break;
        // }
        // sc.close();

    }

}
