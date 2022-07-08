import java.util.Random;

class num{
    public static void main(String[] args){
        Random dice = new Random();
        int number;
        for(int count=1; count<=10;count++){

            number = 1+ dice.nextInt(6);
            System.out.println(number + " ");
            
        }
    }
}