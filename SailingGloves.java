import java.util.Scanner;

public class SailingGloves {
    static Scanner scanner = new Scanner(System.in);

    public static int numOfGloves() {

        System.out.print("Enter number of gloves you want to order: ");
        int numOfGloves = scanner.nextInt();

        return numOfGloves;
    }

    public static int typeOfGloves(){

        System.out.print("Enter type of gloves (1-cotton, 2-leather, 3-neoprene): ");
        int numTypeOfGloves = scanner.nextInt();

        return numTypeOfGloves;
    }

    public static int run(int numOfGloves, int numTypeOfGloves, //input
                          Wrapper<String> contTypeOfGloves //output
    ) {
        int totalAmount = 0;

        if (numTypeOfGloves ==  1){
            totalAmount = numOfGloves * 10;
            contTypeOfGloves.value = "cotton";
        } else if (numTypeOfGloves == 2){
            totalAmount = numOfGloves * 20;
            contTypeOfGloves.value = "leather";
        } else if (numTypeOfGloves == 3){
            totalAmount = numOfGloves * 30;
            contTypeOfGloves.value = "neoprene";
        } else {
            totalAmount = -1;
            contTypeOfGloves.value = "error";
        }

        return totalAmount;
    }

    public static void sysout(int numOfGloves, String typeOfGloves, int totalAmount){
    
        String sysoutConsole = "You have ordered " + numOfGloves + " pairs of " + typeOfGloves + " gloves. Your " +
                "total expense is: " + totalAmount + "€.";

        System.out.println(sysoutConsole);

    }
    public static void sysout(int numOfGloves, Wrapper<String> typeOfGloves, int totalAmount){

        String sysoutConsole = "You have ordered " + numOfGloves + " pairs of " + typeOfGloves.value + " gloves. Your " +
                "total expense is: " + totalAmount + "€.";

        System.out.println(sysoutConsole);

    }

    public static void main(String[] args){

        //input num of pairs
        int inputNumOfPairs = numOfGloves();

        //input type of gloves
        int inputTypeOfGloves = typeOfGloves();

        Wrapper<String> typeOfGloves = new Wrapper<>();
        int totalAmount = run(inputNumOfPairs, inputTypeOfGloves, typeOfGloves);


        //sysout
        sysout(inputNumOfPairs, typeOfGloves.value, totalAmount);
        sysout(inputNumOfPairs, typeOfGloves, totalAmount);
    }

}

