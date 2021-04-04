public class File1 {

    public static void main(String[] args) {


        int topScore = 80;
        int secondTopScore = 60;

        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("you got between 60 and 100");
        }
        if (topScore > 80 || topScore > secondTopScore) {
            System.out.println("You got greater than 80 OR greater than Second top score");
        }
        boolean isCar = false;

        boolean wasCar = isCar ? true : false; // If isCar is true set wasCar to true, else false

        System.out.println(wasCar);


    }


}
