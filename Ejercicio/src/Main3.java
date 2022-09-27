public class Main3 {
    public static void main(String[] args) {
        Persona ulises = new Persona();
        ulises.setEdad(27);
        ulises.setNombre("Ulises");
        ulises.setTelefono(011000000);
        System.out.println(ulises.getEdad());
        System.out.println(ulises.getNombre());
        System.out.println(ulises.getTelefono());
    }

}
class Persona {


    private int edad;
    private String nombre;
    private int telefono;

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
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}
