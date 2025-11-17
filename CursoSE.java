public class CursoSE {

    private String nombre;
    private int edad = 24;

    // public void saludar(){
    //     nombre = "Mitocode";
    //     edad = 4;
    //     System.out.println("Hola " + nombre);
    //     System.out.println("Edad " + edad);
    // }

    public void mostrarEdad(){
        System.out.println(edad);
    }

    public String saludar(String nombre, int edad){
        return "Hola " + nombre + ", tienes " + edad + " años de edad.";
    }

    public static void main(String[] args){

        //** Clase Estructura de clase en java ***/
        CursoSE claseSe = new CursoSE();
        String recepcion = claseSe.saludar("Claudio",29);
        //System.out.println(recepcion);
        claseSe.mostrarEdad();
    }
            
    
}
