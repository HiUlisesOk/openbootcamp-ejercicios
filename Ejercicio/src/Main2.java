public class Main2 {
    public static void main(String[] args) {
        // Parte 1 - Ciclo IF
        int numeroIf = 13;
        if (numeroIf > 0) {
            System.out.println("Positivo");
        } else if (numeroIf < 0) {
            System.out.println("Negativo");
        } else if (numeroIf == 0) {
            System.out.println("Cero");
        }
        // Parte 2 - WHILE
        int numeroWhile = 0;
        while (numeroWhile <= 3){
        numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Parte 3  - Switch
       String estacion ="verano";
        switch (estacion){
            case "verano":
                System.out.println("Verano");

                break;

            case "invierno":
                System.out.println("Invierno");

                break;

            case "otoño":
                System.out.println("Otoño");

                break;

            case "primavera":
                System.out.println("Primavera");

                break;

            default:
                System.out.println("No es una estación");
        }
    }

}

