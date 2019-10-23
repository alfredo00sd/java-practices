package programacion.Generics;

/*Generics
* Con ellos podemos dejar pendiente hasta la implementacion el tipo de dato
* */
public class GenericHandler {

    public static void main(String[] args) {
        //Se puede instancear cualquier tipo Obj de datos, los primitivos no son permitidos.
        GenericClass<Integer> int_obj = new GenericClass<>(15);
        int_obj.obtenerTipo();

        GenericClass<String> str_obj = new GenericClass<>("Hello");
        str_obj.obtenerTipo();

    }
}
