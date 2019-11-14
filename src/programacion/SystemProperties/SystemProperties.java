package programacion.SystemProperties;

import java.util.Enumeration;
import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {

        //Para saber el entorno de trabajo en el cual estamos...
        //y configurar mejor nuestro sistema de acuerdo al entorno.
        Properties properties  = System.getProperties();
        Enumeration propertieNames = properties.propertyNames();
        while (propertieNames.hasMoreElements()){
            String propertyName  = (String) propertieNames.nextElement();
            String propertyValue = properties.getProperty(propertyName);

            System.out.println("Key: "+propertyName+" = "+propertyValue);
        }
    }
}
