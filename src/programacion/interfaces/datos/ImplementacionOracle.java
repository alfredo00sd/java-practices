package programacion.interfaces.datos;
                                    //Can implement multiple interfaces but extends just one
public class ImplementacionOracle implements AccesoDatos {

    //implementation of the Data Access interface
    @Override
    public void insert(){
        System.out.println("Inserting record to Oracle DB...");
    }

    @Override
    public void list(){
        System.out.println("Listing records from Oracle DB...");
    }

}
