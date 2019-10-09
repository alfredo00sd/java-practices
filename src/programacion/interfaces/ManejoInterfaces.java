package programacion.interfaces;

import programacion.interfaces.datos.AccesoDatos;
import programacion.interfaces.datos.ImplementacionMysql;
import programacion.interfaces.datos.ImplementacionOracle;

/*Interface concept
* Is a common way to communicate with other devices or systems, like a contract with a provider and consumer.
* Attributes are like constants the is common to use uppercase for attributes on an interface.
* Methods are by default, public, abstract and they has not an implementation.
* An interface can not inherit from a class but can inherit others interfaces.
*
* Abstract class AC vs an interface i
* AC is used to encapsulate common functionalists between classes (Characterizes in common) is necessary to extend.
* i define a related behavior that belongs to any class or structure is necessary to implement the interface.
* Use AC with objects that are so related and interfaces to implement common functionality to a non-related objects.
* */

public class ManejoInterfaces {

    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionMysql();
        run(datos, "listar");

        datos = new ImplementacionOracle();
        run(datos, "insert");
    }

    private static void run(AccesoDatos datos, String action){
        if("listar".equals(action)){
            datos.list();
        }else if("insert".equals(action)){
            datos.insert();
        }
    }
}
