package programacion.excepciones;

import programacion.excepciones.domain.Division;

public class ManejoExcepciones {

    public static void main(String[] args) {

        try {
            Division division = new Division(10,0);
            division.seeOperation();
        }catch (Exception op){
            System.out.println("Error");
            //print pila de errores
            System.out.println(op.getMessage());
        }

    }
}
