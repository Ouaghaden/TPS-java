package iritage;

public class Test {
    public static void main(String[] args) {
        Perssone P1 =new Etudiant();
        Perssone P2 =new Professeur();
        Perssone P3=new Perssone();
        Etudiant e1=new Etudiant();
        Professeur P4=new Professeur();
        Etudiant e2=(Etudiant) P1;
        Professeur P5=(Professeur) P2;
        System.out.println(e2.note);
        System.out.println(P4.salaire);
        System.out.println(e1.note);
        System.out.println(P5.salaire);



    }
}
