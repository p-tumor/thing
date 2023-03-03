public class Main {
    public static void main(String[] args) {
        int[][] test = new int[][]{
            {1,2,4},
            {9,6,7},
            {3,2,7}
        };
        System.out.println(acrossColumnDupeCheck(test));
    }
    /*
    234
    245
    123
     */
    public static boolean acrossColumnDupeCheck(int[][] thing){
        for(int column = 0; column < thing[0].length; column++){
            System.out.println("column..."+column);
            for (int row = 0; row < thing.length; row++){
                System.out.println("row..."+row);
                int current = thing[row][column];
                System.out.println("current...."+current);
                for(int i = 0; i+column < thing.length;i++){
                    System.out.println("i+column....."+i+column);

                    if(current == thing[row][column+i]) return true;
                }
            }
        }
        return false;
    }
}
