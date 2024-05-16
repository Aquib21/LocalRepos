import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses= 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses= noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("guess number");
        Scanner sc = new Scanner(System.in);
        inputNumber= sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber== number){
            System.out.format("right answer %d\n you guess it in %d attempt", number, noOfGuesses );
            return true;
        }
        else if(inputNumber<number){
            System.out.println("low");
        }
        else if (inputNumber>number){
            System.out.println("high");
        }
        return false;
    }
}
public class num_game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while (!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
            System.out.println(b);
        }

    }
}
