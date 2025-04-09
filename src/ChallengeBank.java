import java.util.Scanner;

public class ChallengeBank {
    public static void main(String[] args) {
        //Datos del cliente
        String nombreCliente = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        //Menú de opciones del banco
        System.out.println("***********************");
        System.out.println("\nNombre del cliente: " + nombreCliente);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: $" + saldo);
        System.out.println("\n***********************");

        String menu = """
                ****Escriba la opción que desea realizar ****
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                4. Salir
                """;

        while (opcion != 4) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSu saldo disponible es: $" + saldo); //Visualizar saldo
                    break;
                case 2:
                    System.out.println("¿Cuánto dinero desea retirar?"); //Solicitar cantidad a retirar
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insifuciente");
                    } else {
                        saldo -= valorARetirar;
                        System.out.println("\nSu nuevo saldo es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cuánto dinero desea depositar?"); //Solicitar cantidad a depositar
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("\nSu saldo actualizado es: $" + saldo);
                    break;
                case 4:
                    System.out.println("\nFinalizando operación... Gracias por usar el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Por favor, elija una opción válida.");
            }
        }
    }
}
