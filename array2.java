public class array2 {
    public static void main(String[] args) {
        int[][] scores ={
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}

           
        };
        System.out.println("Duyệt mảng nè : ");
        for (int[] row : scores) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
