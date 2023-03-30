package MeusKost;
public class FavNumber{

    static int rand;
    public FavNumber(){
        this.rand=(int)(Math.random()*233);

    }

    public static int getRand() {
        return rand;
    }

    public static void tagasta() {

        System.out.println("Aaa, see ka!");
        System.out.println("Su uus õnnenumber "+Integer.toString(getRand()));
    }
}