
public class PrimeraClase {
    public static void main(String[] args) {
        System.out.println("Concluí el aula 01 y ahora estoy sumergiéndome en Java!");
        System.out.println("Bienvenido a Stream Watch");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        String nombreDeLaPelicula = "Matrix";
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.7;

        double media = (8.5 + 5.0 + 7.5) / 3;
        System.out.println(media);

        String sinopsis = nombreDeLaPelicula + """
                 es una paradoja
                La mejor película de ciencia ficción del milenio
                Fue lanzado en el año 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        //Casting: Casteo Explícito
        int clasificacionEstrellas = (int) media / 2;
        System.out.println("La clasificación de la película fue de: " + clasificacionEstrellas + " puntos");

    }
}
