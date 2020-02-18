import java.util.Random;
public class Deck {
    private Card []point;
    private int meh;
    public Deck(){
        char [] suits= {'H','D','S','C'};
        char [] ranks= {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
        point = new Card[52];
        meh = 0;
        int counter = 0;
        Card C1;
        for (int s=0;s<suits.length;s++)
        {
            for (int r=0;r<ranks.length;r++){
                C1=new Card(ranks[r],suits[s]);
                point[counter++]=C1;        //counts how many cards in deck
            }
        }
    }
    public void display() {
        int index = 1;
        for (int i = 0; i < 52; i++) {
            if (point[i].getRank() == 'T')
                System.out.print("10" + "" + point[i].getSuit() + " ");
            else
                System.out.print(point[i].getRank()  + "" +  point[i].getSuit() + " ");
            if (index%13 == 0 && !(i == 0)) {
                System.out.println("\n");
            }
            index++;
        }
    }
    public void shuffle(){
        Random rand=new Random();
        for (int i=0; i<1000; i++){
            int x = rand.nextInt(52);
            int y = rand.nextInt(52);
            Card temp = point[x];
            point[x]=point[y];
            point[y]=temp;


        }
    }
    public Card deal()
    {
        return point[meh++];
    }
    public int cardsleft(){
        return(52-meh);
    }
}
