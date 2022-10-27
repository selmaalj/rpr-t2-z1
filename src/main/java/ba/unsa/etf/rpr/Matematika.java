package ba.unsa.etf.rpr;

public class Matematika {
    public static int Faktorijel(int n){
        int rezultat = 1;
        for(int i = 1; i <= n; i++)
            rezultat*= i;
        return rezultat;
    }

    public static double Sinus(double x){
        x *= Math.PI / 180;
        double rezultat=0;
        int predznak=-1;
        for(int i=1; i<20; i+=2){
            predznak*=(-1);
            rezultat += predznak * Math.pow(x,i) / Faktorijel(i);
        }
        return rezultat ;
        //return Math.sin(x*Math.PI/180);
    }
}

