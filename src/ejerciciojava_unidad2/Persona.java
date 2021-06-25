package ejerciciojava_unidad2;

import javax.swing.JOptionPane;
        
public class Persona {
    //Atributos
    String nombre = "sin definir";
    String apellido = "sin definir";
    int edad = 0;
    String hobbie = "sin definir";
    String editorCodigo = "sin definir";
    String sistOperativo = "sin definir";
    
    //metodo constructor
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, String hobbie, String editorCodigo, String sistOperativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorCodigo = editorCodigo;
        this.sistOperativo = sistOperativo;
    }
    
    //metodos 
    public void ingresarDatos(){
        nombre = JOptionPane.showInputDialog("Ingrese un nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese un apellido: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una edad: "));
        hobbie = JOptionPane.showInputDialog("Ingrese un hobbie: ");
        editorCodigo = JOptionPane.showInputDialog("Ingrese el editor de código preferido: ");
        sistOperativo = JOptionPane.showInputDialog("Ingrese el sistema operativo que usa: ");        
    }
    
    public void mostrarDatos(){
     System.out.println("El nombre es: " + nombre);
     System.out.println("El apellido es: " + apellido);
     System.out.println("La edad es: " + edad);
     System.out.println("El hobbie es: " + hobbie);
     System.out.println("El editor de codigo preferido es: " + editorCodigo);
     System.out.println("El sistema operativo que usa es: " + sistOperativo);
    }
       
}
