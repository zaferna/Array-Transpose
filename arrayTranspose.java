import java.util.Arrays;

public class arrayTranspose {
    public static void main(String[] args) {
        int[][] arr1 ={
                {1,2,3},
                {4,5,6},
        };
        int[][] arr2= new int[3][2];
        int start1,start2;
        start1=0;
        start2=0;

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length;j++){

               arr2[j][i]=arr1[i][j];
                

            }

        }

       for(int i=0 ; i< arr2.length;i++){
           for(int j=0; j<arr2[0].length;j++){

               System.out.print(arr2[i][j]+ " ");
           }
           System.out.println(" ");
       }

    }
}
