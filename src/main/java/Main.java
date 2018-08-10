import bd.seu.ac.OS;
import bd.seu.ac.OperatingSystemFactory;

public class Main {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("open");
        obj.spec();


    }
}
