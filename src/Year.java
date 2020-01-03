import java.util.*;
public class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year:");
        int y = scanner.nextInt();

        if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
            System.out.println("leap year: 1");
        }
        else if(y % 100 == 0 && y % 400 == 0){
            System.out.println("leap year: 1");
        }
        else{
            System.out.println("0");
        }
    }
}

