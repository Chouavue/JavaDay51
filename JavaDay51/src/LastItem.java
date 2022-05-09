import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter some words");

        while (true){
            String userInput = scanner.nextLine();
                    if (userInput.isEmpty()){
                        System.out.println("The last item in the list is: " + list.get(list.size()-1));
                    }else{
                        list.add(userInput);
                        
                    }
    }
}
}
