package programacion.beans;

public class ManejoJavaBeans {

    public static void main(String[] args) {
        PersonaBean bean = new PersonaBean();
        bean.setName("Alfredo");
        bean.setAge(20);

        System.out.println("Name : "+bean.getName());
        System.out.println("Age : "+bean.getAge());
    }

}
