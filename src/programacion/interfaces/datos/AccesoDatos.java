package programacion.interfaces.datos;

public interface AccesoDatos {
    //constants are public and static by default
    public static int MAX_RECORDS = 10;
    //methods are public and abstract by default
    public abstract void insert();
    public abstract void list();

    //The class that implements those methods will define their behavior
}
