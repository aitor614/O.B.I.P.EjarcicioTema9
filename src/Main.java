public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setEdad(25);
        int edad = cliente.getEdad();
        cliente.setNombre("Rodrigo");
        String nombre = cliente.getNombre();
        cliente.setNumTelefono(555555555);
        int numTelefono = cliente.getNumTelefono();
        cliente.setCredito(500);
        int credito = cliente.getCredito();

        System.out.println("Edad: " + edad);
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + numTelefono);
        System.out.println("Credito: " + credito + "$");
    }
}
class Persona {
    int edad;
    String nombre;
    int numTelefono;
    public Persona() {
        System.out.println("Persona \n..............");
    }
}
class Cliente extends Persona {
    int credito;

    public Cliente() {
        System.out.println("Cliente: ");
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    public int getNumTelefono() {
        return this.numTelefono;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }
    public int getCredito() {
        return this.credito;
    }
}