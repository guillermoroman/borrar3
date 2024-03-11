import java.util.*;

/**
 * Clase Libro que representa un libro con título, autor y año de publicación.
 * Se utiliza para demostrar la documentación con Javadoc.
 *
 * @author Tu nombre
 * @version 1.0 17-10-1984
 */
public class Libro {

    /**
     * Título del libro en versión original.
     */
    private String titulo;

    /**
     * Autor del libro con el formato "Apellidos, nombre"
     */
    private String autor;

    /**
     * Año de publicación
     */
    private int añoPublicacion;

    /**
     * Constructor de objetos de la clase Libro
     * @param titulo Título del libro en versión original.
     * @param autor Autor del libro con el formato "Apellidos, nombre"
     * @param añoPublicacion Año de publicación
     */
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    // Getters y Setters

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     *
     * @param titulo El título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     *
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     *
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el año de publicación del libro.
     *
     * @return El año de publicación del libro.
     */
    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    /**
     * Establece el año de publicación del libro.
     *
     * @param añoPublicacion El nuevo año de publicación del libro.
     */
    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }
}
