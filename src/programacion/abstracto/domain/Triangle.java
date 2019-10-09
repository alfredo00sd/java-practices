package programacion.abstracto.domain;

public class Triangle extends GeometricShape {

    public Triangle(String shapeType){
        super(shapeType);
    }

    public void draw(){
        //Is necessary to implement the method ... defined as abstract in parent class...
        System.out.println("Aca se dibuja un : " +  this.getClass().getSimpleName());
    }
}
