import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter some words");

        while (true){
            String userInput = scanner.nextLine();
                    if (userInput.isEmpty()){
                        System.out.println("this is the fifth item in the list: " + list.get(4));
                    }else{
                        list.add(userInput);
                        
                    }
    }
}


}


