package programacion.excepciones.domain;

//ejecutar division
public class Division {

    private int numerator;
    private int denominator;

    //throws ... la exception que podria arrojar este metodo
    public Division(int numerator, int denominator) throws OperationException {

        if (denominator == 0){
            //arroja la excepcion porque no se puede n/0
            throw new OperationException("Para operar la division, el denominador debe ser diferente de 0.");
        }
        //inizialize the arguments...
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void seeOperation(){
        System.out.println("El resultado de la division es : " + numerator/denominator);
    }
}
