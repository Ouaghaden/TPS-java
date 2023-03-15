package ma.education.tp.test;

public class XY {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        for (short z=0;z<5;z++)
            if((++x>2||++y>2))
                ++x;
        System.out.println(x+" "+y);
    }
}
