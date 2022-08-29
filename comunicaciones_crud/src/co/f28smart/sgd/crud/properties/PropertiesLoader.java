package co.f28smart.sgd.crud.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

import org.apache.log4j.Logger;

public class PropertiesLoader {
    public PropertiesLoader() {
        super();
    }


    private static final Logger logger = Logger.getLogger(PropertiesLoader.class);
    private Properties props = new Properties();
    private static PropertiesLoader INSTANCE = null;

    public static PropertiesLoader getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PropertiesLoader();
            INSTANCE.initInstance();
        }
        return INSTANCE;
    }


    private void initInstance() {
        InputStream input = null;

        try {

            String jvmProperty = System.getProperty("user.dir")+"/config/SGD/SGD.properties";
            logger.debug("SGD.properties location :"+jvmProperty);
            File propsFile = new File(jvmProperty);
            input = new FileInputStream(propsFile);

            // load a properties file
            props.load(input);
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public String getProperty ( PropertiesKeys key ){
       return (String)props.get(key.getKey());
    }
    
}
