package programacion.interfaces.datos;

public interface AccesoDatos {
    //constants are public and static by default
    int MAX_RECORDS = 10;
    //methods are public and abstract by default
    void insert();
    void list();

    //The class that implements those methods will define their behavior
}
