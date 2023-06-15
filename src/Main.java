import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<LevendeWezens> reservatieLijst = new ArrayList<>();

        //observable
        Persoon dogukan = new Persoon();
        Persoon nigel = new Persoon();
        Alien et = new Alien();

        reservatieLijst.add(nigel);
        reservatieLijst.add(dogukan);
        reservatieLijst.add(et);

        //observers
        Vriend steven = new Vriend();
        Familie vader = new Familie();
        Collega henk = new Collega();

        et.Add(steven);
        dogukan.Add(vader);
        dogukan.Add(henk);

        dogukan.Plannen("Zondag");

        for (LevendeWezens persoon : reservatieLijst) {
            persoon.Plannen("Geannuleerd");
        }
    }
}