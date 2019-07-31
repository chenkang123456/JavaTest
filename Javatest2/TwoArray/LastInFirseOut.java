public class LastInFirseOut{
    private int[] nums;
    int index=0;
    public LastInFirseOut(int size){
        nums = new int [size];   
    }
    public boolean push(int val){
        if(index<=nums.length){
            nums[index]=val;
            index++;
            b=true;
        }
        else{
            System.out.println("已经饱和");
        }
        return b;
    }
    public int pop(){
        int n=0;
    if(index>=1){
        int n= nums[--index];
        nums[index]=0;
        return n;
    }
      public String toString(){
          
      } 
    }
}