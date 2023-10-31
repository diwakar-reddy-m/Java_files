import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int length= obj.nextInt();
        int array[]= new int[length]; 
        System.out.println("Enter the array elements");
        for(int i=0;i<array.length;i++){
            array[i]= obj.nextInt();
        }
        int temp =0;
        int n = array.length;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                     if(array[j-1] > array[j]){  
                            //swap elements  
                            temp = array[j-1];  
                            array[j-1] = array[j];  
                            array[j] = temp;  
                    }     
            }  
        }
        System.out.println("Array after bubble sort");
        for(int i=0; i < array.length; i++){  
            System.out.println(array[i] +" ");  
    }  
    System.out.println("Lowest number is:"+array[0]);
}
}