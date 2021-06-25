package ejerciciojava_unidad2;
//Crear un programa en java en el cual se pida al usuario ingresar 
//su nombre, apellido, edad, hobbie, editor de código preferido, sistema operativo que utiliza 
//luego deberá mostrarse por consola los datos ingresados

public class Main {
    
    public static void main(String[] args) {
     
        Persona persona1 = new Persona();
        
        persona1.ingresarDatos();
        persona1.mostrarDatos();
    }
}
