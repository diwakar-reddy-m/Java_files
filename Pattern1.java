import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.print("Enter the number:");
    int number = myObj.nextInt();
        for (int i=number;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();    
        }
    }
}
