public class text09{
    public static void main(String[] args) {
        int [][][] arr=new int [][][] {{{1,2},{3,55},{44,72}},{{22,33},{12,43},{65,30}},{{20,70},{10,32},{52,17}},{{111,90},{71,76},{18,42}}};
    
        for(int i=0;i<arr.length;i++){
            System.out.println();
            for(int j=0;j<arr[i].length;j++){
                System.out.println();
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.print(arr[i][j][k]+"\t");
                }
            }
        }
    }
}