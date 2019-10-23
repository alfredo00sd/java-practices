package programacion.excepciones;

import programacion.excepciones.domain.Division;
import programacion.excepciones.domain.OperationException;

public class ManejoExcepcionesArg {

    public static void main(String[] args) {

        try{
            int op1 = Integer.parseInt(args[0]);
            int op2 = Integer.parseInt(args[1]);

            Division div = new Division(op1,op2);
            div.seeOperation();
        }catch (ArrayIndexOutOfBoundsException aie){
            System.out.println("Excepcion");
            System.out.println("Error al acceder elemento fuera del rango");
            System.out.println(aie.getMessage());
            aie.printStackTrace();
        }catch (NumberFormatException nf){
            System.out.println("Otra exepcion");
            System.out.println("Uno de los argumentos no es entero");
            nf.printStackTrace();
        }catch (OperationException op){
            System.out.println("Otra mas");
            System.out.println("Operacion erronea");
            op.printStackTrace();
        }finally {
            System.out.println("Terminan las excepciones y siempre me ejecuto.");
        }

    }
}
