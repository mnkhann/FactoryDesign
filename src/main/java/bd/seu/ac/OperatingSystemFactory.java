package bd.seu.ac;

public class OperatingSystemFactory {

    public OS getInstance(String str) {
        if (str.equals("open"))
            return new Android();
        else if (str.equals("close"))
            return new Iphone();
        else
            return new Windows();
    }

}
