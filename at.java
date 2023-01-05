public class at {

    public static void main(String[] args) {

        // Caso 1
        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El número" + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número" + numeroIf + " es negativo");
        } else {
            System.out.println("El número" + numeroIf + " es cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Número while: " + numeroWhile);
        }

        // Caso 2
        numeroWhile = 2;

        do {
            numeroWhile++;
            System.out.println("Número dowhile: " + numeroWhile);
        } while (numeroWhile < 3);

        // Caso 3
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("Número for: " + numeroFor);
        }

        // Caso 4
        String estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");

                break;
            case "invierno":
                System.out.println("Estamos en invierno");

                break;
            case "primavera":
                System.out.println("Estamos en primavera");

                break;

            default:
                System.out.println("No es un nombre de estación válida");
                break;
        }
    }
}
