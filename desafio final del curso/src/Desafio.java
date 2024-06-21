import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Negan";
        String tipoDeCuenta = "Corriente";
        double saldo = 17000.00;
        int opcion = 0;

        System.out.println("$@$@$@$@$@$@$@$@$@$@$@$@$@$@$@$@$");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: $" + saldo);
        System.out.println("\n$@$@$@$@$@$@$@$@$@$@$@$@$@$@$@$@$");

        String menu = """
                \n## Selecciona una opción ##
                1 - Consultar saldo 
                2 - Retirar
                3 - Depositar
                9 - Salir
                \n Opción: """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSaldo actual: $" + saldo);
                    break;
                case 2:
                    System.out.println("\nIngresa el monto a retirar: $");
                    double montoARetirar = teclado.nextDouble();
                    if (saldo < montoARetirar) {
                        System.out.println("\nSaldo insuficiente  ;(");
                    } else {
                        saldo -= montoARetirar;
                        System.out.println("\nNuevo saldo: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("\nIngresa el monto a depositar: $");
                    double montoADepositar = teclado.nextDouble();
                    saldo += montoADepositar;
                    System.out.println("\nNuevo saldo: $" + saldo);
                    break;
                case 9:
                    System.out.println("Auf wiedersehen <3");
                    break;
                default:
                    System.out.println("xxxxxx Opción inválida xxxxxx");
                    break;
            }
        }
    }
}
