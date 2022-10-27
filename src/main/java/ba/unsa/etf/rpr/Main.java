package ba.unsa.etf.rpr;
public class Main {
    public static void main( String[] args )
    {
        //System.out.println();
        if(args[0].equals("sinus")) {
            double rez = Matematika.Sinus(Double.valueOf(args[1]));
            System.out.println("Sinus unesenog ugla je: " + rez);
        }else if(args[0].equals("faktorijel")){
            double rez = Matematika.Faktorijel(Integer.valueOf(args[1]));
            System.out.println("Faktorijel unesenog broja je: " + rez);
        }
    }
}