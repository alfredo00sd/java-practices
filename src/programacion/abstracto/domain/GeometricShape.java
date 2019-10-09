package programacion.abstracto.domain;

public abstract class GeometricShape {

    protected String shapeType;

    protected GeometricShape(String shapeType){
        this.shapeType = shapeType;
    }

    //abstract method
    public abstract void draw();

    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    @Override
    public String toString() {
        return "GeometricShape{" + "shapeType = '" + shapeType + '\'' + '}';
    }
}
