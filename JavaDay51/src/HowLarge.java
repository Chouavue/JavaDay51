import java.util.Scanner;
import java.util.ArrayList;

public class HowLarge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter some words");

        while (true){
            String userInput = scanner.nextLine();
                    if (userInput.isEmpty()){
                        System.out.println("the total amount of items in the list was: " + list.size());
                    }else{
                        list.add(userInput);
                        
                    }
    }
}
}
    