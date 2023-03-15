package ma.education.tp.test;

import ma.education.tp.singletan.Soliel;

public class Test {
    public static void main(String[] args) {
        Soliel s1=Soliel.getInstance(1000);
        Soliel s2=Soliel.getInstance(2000);

        System.out.println(s1.surface);
        System.out.println(s2.surface);


    }
}
