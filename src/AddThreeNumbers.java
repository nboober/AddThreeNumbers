import java.util.ArrayList;

public class AddThreeNumbers {
    public static void main(String[] args){

        int sum = 0;

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }

        System.out.println("The total of your numbers is: " + sum);

    }
}
