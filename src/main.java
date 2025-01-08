
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Array length: ");
        int n = input.nextInt();
        int[] A = new int[n];


        // input
        for(int i = 0; i < n; i++){
            System.out.print("A[" + i + "]: ");
            A[i] = input.nextInt();
        }

        // разделяем массив
        int n1, n2;
        if(n % 2 == 0){
            n1 = n/2;
            n2 = n - n1;
        }
        else{

            n1 = (n - 1)/2;
            n2 = n - n1;
        }
        System.out.println(n1 + " " + n2);

        // разделяем массив 1
        int[] Arr1 = new int[n1];
        int[] Arr2 = new int[n2];

        // 1 array
        for(int i = 0; i < n1; i++){
            Arr1[i] = A[i];
        }

        // 2 array
        int j = 0;
        for(int i = n1; i <= n2 + 1; i++){
            Arr2[j] = A[i];
            j++;
        }

        int i1 = 0, i2 = 0;
        for(int k = 0; k < n; k++){
            if(i1 > n1 - 1){
                A[k] = Arr2[i2];
                i2++;
            }
            else if(i2 > n2 - 1){
                A[k] = Arr1[i1];
                i1++;
            }
            else if(Arr1[i1] < Arr2[i2]){
                A[k] = Arr1[i1];
                i1++;
            }
            else{
                A[k] = Arr2[i2];
                i2++;
            }
        }


        for(int s = 0; s < n; s++){
            System.out.print("A[" + s + "]: ");
            System.out.println(A[s]);
        }


    }

}