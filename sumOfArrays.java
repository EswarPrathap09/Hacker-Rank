import java.util.*;

public class sumOfArrays {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];

        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }


        System.out.print(solution.simpleArraySum(array,n));
    }
}

class solution{

    static int simpleArraySum(int [] arr,int size){

        int sum =0;
        for (int i = 0; i<size;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

}
