public class Main {

    public static void main(String[] args) {


        Fighter zafer = new Fighter("Zafer" , 15 , 100, 90, 0);
        Fighter sinan = new Fighter("Sinan" , 10 , 95, 100, 0);
        Match r = new Match(zafer, sinan , 90 , 100);
        r.start();

    }

}