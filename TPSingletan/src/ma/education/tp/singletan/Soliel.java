package ma.education.tp.singletan;

public class Soliel {
    private static Soliel instance;
    public double surface;
    private Soliel(double surface){
        this.surface=surface;
    }
    public static Soliel getInstance(double surface){
        if(instance==null)
            instance=new Soliel(surface);


        return instance;
    }

}
