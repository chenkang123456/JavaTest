import java.util.Arrays;

public class QuickSort{
    public void quickSqrt(int a[],int head,int tail){
        int[] arr=new int [tail-head+1];
        int compareVal=a[head];

        int lS=0;
        int rB=0;

        int compareIndex;

        for(int i=head+1;i<=tail;i++){
            if(a[i]<=compareVal){
                lS++;
            }else{
                rB++;
            }
        }

        compareIndex=lS;
        int lSIndex=0;
        int rBIndex=compareIndex+1;
        for(int i=head+1;i<=tail;i++ ) {
            if(a[i]<=compareVal){
                arr[lSIndex++]=a[i];
            }else{
                arr[rBIndex++]=a[i];
            }
        }
        arr[compareIndex]=compareVal;

        int tempIndex=0;
        for(int j=head;j<=tail;j++){
            a[j]=arr[tempIndex++];
        }

        //左
        int lhead=head;
        int ltail=head+compareIndex-1;
        if(ltail-lhead>=1){
            quickSqrt(a,lhead,ltail);
        }
        //右
        int rhead=head+compareIndex+1;
        int rtail=tail;
        if(rtail-rhead>=1){
            quickSqrt(a, rhead, rtail);
        }
    }

    public static void main(String[] args) {
        QuickSort QS=new QuickSort();
       
        int[] arr={10,2,4,19,20,40,199,49,65,20,5,3,5,35,67};
        QS.quickSqrt(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
