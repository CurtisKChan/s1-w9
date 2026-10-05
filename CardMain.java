public class CardMain{
    public static void main(String[] args) {
        Card c1 = new Card(10,3);
        Card c2 = new Card(9,2);
        boolean c1isBigger = c1.outranks(c2);
        boolean c2isBigger = c2.outranks(c1);
        System.out.println(c1Bigger);
        System.out.println(c2Bigger);
        
    }

}