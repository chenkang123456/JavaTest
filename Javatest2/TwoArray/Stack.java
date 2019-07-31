public class Stack{
    private Integer[] data;

    public Stack(int size) {
        if (size<=0){
            System.out.println("ERROR:size out of bounts ...");
            return;
        }

        this.data=new Integer[size];
    }
    /**
     * 进栈
     */
    public boolean push(int element){
        if(isFull){
            System.out.println("ERROR:is full...");
            return false;
        }
        int index=getFirstNullIndex();
        data[index]=element;
        return true;
    }

      /**
     * 出栈
     */
    public Integer pop(){

    }

     /**
      * 查看栈顶元素
      */

      /**
       * 是否满
       * 
       */
      public boolean ifFull(){
          if (data[0]!=null){
              return true;

          } 
          return false;
      }
      /**
       * 是否空
       */

       /**
        * 私有方法，找第一个为空的元素角标
        */
        private int getFirstNullIndex(){
            if(isFull()){
                return -1;
            }
            for(int i=0;i<data.length;i++){
                if (data[i] == null) {
                    return i;
                }
            }
            return -1;
        }
        /**
        * 私有方法，找最后一个不为空的元素角标
        */
        private int getLastNullIndex(){
            if(isEmpty()){
                return -1;
            }
            for(int i=0;i<data.length;i++){
                if (data[data.length-i-1] != null) {
                    return i;
                }
            }
            return -1;
        }

        private int getFirstNullIndex(){
            for(int i=0;i<data.length;i++){
                if(data[i]==null){
                    return i;
                }
            }
        }
}