package programacion.Generics;

//el operador diamante <> indica que puede ser cualquier tipo, por lo que solo se le pone T y en la
//Implementacion se le da el tipo.
//Con ellos se evita definir sino hasta la implementacion el tipo de dato para un para metro o clase
//T = Objeto generico
public class GenericClass<T> {

    private T obj;

    public GenericClass(T obj){
        this.obj = obj;
    }

    public void obtenerTipo() {
        System.out.println("El tipo T es :" + obj.getClass().getName());
    }

    /*Tipos genericos
    *   E -> element (usado generalmente por el framework de colecciones de java)
    *   K -> Key (Llave, utilizado en los mapas)
    *   V -> Value (representa un valor, usado en los mapas)
    *   N -> Number
    *   S,U,V -> usados para otros tipos
    *   T -> Type (representa un tipo, es decir una clase)
    * */
}
