public class Card {
    private char suit;      //define char for suit
    private char rank;      //define char for rank

    public Card(char r, char s) {           //make function that assigns rank and suit
        rank = r;
        suit = s;
    }

    public void display() {
        if (rank == 'T') {
            System.out.print("10" + suit + ",");    //aocount for 10
        }
        else
            {
            System.out.print(rank);
            System.out.print(suit);
            System.out.print(",");
        }
    }

    public int getValue() {
        if (rank == 'A') {
            return 1;
        } else if (rank == '2') {
            return 2;
        } else if (rank == '3') {
            return 3;
        } else if (rank == '4') {
            return 4;
        } else if (rank == '5') {
            return 5;
        } else if (rank == '6') {
            return 6;
        } else if (rank == '7') {
            return 7;
        } else if (rank == '8') {
            return 8;
        } else if (rank == '9') {
            return 9;
        } else if (rank == 'T') {
            return 10;
        } else if (rank == 'J') {
            return 10;
        } else if (rank == 'Q') {
            return 10;
        } else if (rank == 'K') {
            return 10;
        } else
            return 0;
    }

    public char getRank() {
        return rank;
    }

    public char getSuit() {
        return suit;
    }
}
