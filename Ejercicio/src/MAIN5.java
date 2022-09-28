public class MAIN5 {
    public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.nombre = "Anastasio";
    cliente.edad = 17;
    cliente.telefono = "011 000 000";
    cliente.credito = 100;
        System.out.println(cliente.edad);
        System.out.println(cliente.nombre);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);


        ////

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Raul";
        trabajador.edad = 17;
        trabajador.telefono = "011 111 001";
        trabajador.salario = 1000;
        System.out.println(trabajador.edad);
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}
  class Persona1 {
       int edad;
       String nombre;
       String telefono;
    }

class Cliente extends Persona1{
    public int credito;
    }

class Trabajador extends Persona1{
    public int salario;
}


