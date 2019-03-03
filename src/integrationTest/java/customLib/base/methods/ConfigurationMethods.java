package customLib.base.methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigurationMethods {

    private static Properties properties=null;
    private static ConfigurationMethods obj=null;

    public static ConfigurationMethods getInstance()
    {
        if(obj==null)
            obj=new ConfigurationMethods();

        return obj;

    }

    public static void readConfigFile() {
        if(properties==null)
        {
            properties=new Properties();
            InputStream file= null;
            try {
                String path = System.getProperty("user.dir");
                file = new FileInputStream(path+"/integrationTest/resources/customLib/config.properties");
                //file = new FileInputStream("integrationTest/resources/customLib/config.properties");

                properties.load(file);
                System.out.println(properties.getProperty("Browser"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getRegionProperty()  {

        readConfigFile();
        String env = null;
        env=System.getenv("REGION");
        if(env==null)
            return properties.getProperty("UAT_URL");

        return properties.getProperty(env+"_URL");

    }

    public String getPropertyValue(String prop){
        readConfigFile();
        System.out.println(properties.getProperty(prop));
        return properties.getProperty(prop);
    }
}
