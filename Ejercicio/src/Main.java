public class Main {
    public static void main(String[] args) {
       int resultant = sumar(100,10,10);
       System.out.println(resultant);

        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static class Coche {
     public int puertas = 4;

     public void agregarPuertas() {
         this.puertas++;
     }
    }



}

