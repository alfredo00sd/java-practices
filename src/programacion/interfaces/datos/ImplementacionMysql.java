package programacion.interfaces.datos;

public class ImplementacionMysql implements AccesoDatos{

    @Override
    public void insert(){
        System.out.println("Inserting record to MySQL DB...");
    }

    @Override
    public void list(){
        System.out.println("Listing records from MySQL DB...");
    }
}
