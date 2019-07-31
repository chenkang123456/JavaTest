public class Array{
public static void sesionSort(int oldArray[]) {
    
    for(int i=0;i<oldArray.length-1;i++){
        int k=i;
        for(int j=k+1;j<oldArray.length;j++){
            if(oldArray[k]>oldArray[j]){
                k=j; 
            }           
        }
     if(k!=i){
        int temp=oldArray[i];
        oldArray[i]=oldArray[k];
        oldArray[k]=temp;
     }
    }
   
    for(int n:oldArray){
        System.out.print(n+"\t");
    }

}
    public static void main(String[] args) {
        int arr[]={100,43,24,56,87};
        sesionSort(arr);
    }
}