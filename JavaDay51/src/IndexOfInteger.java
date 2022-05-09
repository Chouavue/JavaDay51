import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter some numbers");

        while (true){
            int userInput = scanner.nextInt();
                    if (userInput == 0){
                        System.out.println("Done entering integers into the list");
                        System.out.println("What number are you looking for in the list?");
                        int secondInput = scanner.nextInt();
                        // System.out.println( secondInput + " is at index " + list.indexOf(secondInput));
                        for ( int i = 0; i < list.size(); i ++){
                            if (list.get(i)==secondInput){
                                System.out.println(secondInput + " is at index " + i);
                            }

                        }
                    }else{
                        list.add(userInput);
                    }
    }
}
}

