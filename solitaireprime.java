//Dennis Livshyts
//CECS 274-05
//Prog 1-Marathon
//Due Date (February 11, 23,2020)



import java.util.Scanner;
public class solitaireprime {
    public static boolean isPrime(int x) {
        boolean isPrime = true;
        if (x <= 1) {
            isPrime = false;
        }
        for (int i = 2; i <= x / 2; ++i) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }

    public static int menu() {
        System.out.println("\nWelcome to Solitaire Prime\n1)New Deck\n2)Display Deck\n3)Shuffle Deck\n4)Play Solitaire Prime\n5)Exit");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        return choice;
    }

    public static void main(String[] args) {
        Deck newDeck = null;
        int choice;


        do {
            choice = menu();
            if (choice == 1)
            {
                newDeck = new Deck();
            } else if (choice == 2)
            {
                newDeck = new Deck();
                newDeck.display();
            }
            else if (choice == 3)
            {
                newDeck.shuffle();

            } else if (choice == 4) {
                System.out.print("Playing Solitaire Prime\n");
                newDeck = new Deck();
                newDeck.shuffle();
                int sum = 0;
                int countPrime = 0;
                Card C;
                for (int i = 0; i < 52; i++)
                {
                    C = newDeck.deal();
                    C.display();
                    sum = sum + C.getValue();
                    System.out.print(" ");
                    if (isPrime(sum)==true) {
                        System.out.print("Prime:" + sum + "\n");
                        sum = 0;
                        countPrime++;
                    }
                    if (i == 51 && sum == 0) {
                        System.out.println("Winner in" + countPrime + "Piles\n");
                        break;
                    } else if (i == 51 && sum != 0) {
                        System.out.println("loser\n");
                        break;
                    }
                }
            }
                    else if (choice==5){
                        System.out.print("Goodbye");
                        return;
                    }
                    else
                        System.out.print("Please choose a selection");
            }while (choice != 5);

        }

}
