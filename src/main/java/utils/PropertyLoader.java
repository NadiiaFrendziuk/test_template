package utils;
import java.util.ResourceBundle;

public class PropertyLoader {
    private static ResourceBundle res = ResourceBundle.getBundle("config");
    public static String loadProperty (String name){
        return res.getString(name);
    }

}
