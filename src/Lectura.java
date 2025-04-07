import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner tecleado = new Scanner(System.in);
        System.out.println("¿Cual es tu película favorita?: ");
        String peliculaFavorita = tecleado.nextLine();
        System.out.println("¿En que año se lanzó la película?: ");
        int FechaDeLanzamiento = tecleado.nextInt();
        System.out.println("¿Que puntaje le das a la película?: ");
        double puntuacion = tecleado.nextDouble();

        System.out.println("Tu película favorita es: " + peliculaFavorita);
        System.out.println("El año de lanzamiento es: " + FechaDeLanzamiento);
        System.out.println("Tu puntuación para la película es: " + puntuacion);

    }
}
