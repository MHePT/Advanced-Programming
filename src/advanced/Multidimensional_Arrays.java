package advanced;

public class Multidimensional_Arrays {

    void Run_1D() {

        //Declaration
        int arr[] = new int[4];
        
        //Intialization
        for (int i : arr)
            arr[i] = i;

        //Printing
        for (int i : arr) 
            System.out.println("My 1D Array index " + i);
        

    }

    void Run_2D() {

        //Declaration
        int arr[][] = new int[3][3];
        
        //Intialization
        for (int i = 0; i<arr.length;i++)
            for (int j : arr[i])
                 arr[i][j] = i*j;
        
        //Printing
        for (int i = 0; i<arr.length;i++){
            for (int j : arr[i]){
                
                if (arr[i].length > j)
                    System.out.println(arr[i][j]+", ");
                else
                    System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        
    }

    void Run_3D() {

        //Declaration
        int arr[][][] = new int[3][3][3];
        
        //Intialization
        for (int i = 0; i<arr.length;i++)
            for (int j = 0; j<arr[0].length;i++)
                for (int k = 0; k<arr[0][0].length;i++)
                    arr[i][j][k] = i*j*k;
        
        //Printing
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[0].length;i++){
                for (int k = 0; k<arr[0][0].length;i++){
                
                if (arr[i][j].length > j)
                    System.out.println(arr[i][j][k]+", ");
                else
                    System.out.println(arr[i][j][k]);
                }
            
            System.out.println("\n");
            }
        }
    }
    
    void Run_Triangled() {

        //Declaration and fixed intialization
        int arr[][] = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5},
            {3, 4, 5},
            {4, 5},
            {5}
        };

        //Printing
        System.out.println("My Triangled Array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j : arr[i]) {

                if (arr[i].length > j) 
                    System.out.println(j + ", ");
                else
                    System.out.println(j);
            }
            System.out.println();
        }

    }

}
