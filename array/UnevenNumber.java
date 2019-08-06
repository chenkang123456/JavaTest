package Array;

public class UnevenNumber {
    public static void main(String[] args){
        System.out.println("100以内的素数有：");
        int[] arr={};
        int i=2,j=0,m;
        label1:
        for(i=2;i<100;i++)
        {
            for(m=2;m<=(int)(Math.ceil(Math.sqrt(i)));m++)
            {
                if(i%m==0)
                {
                    continue label1;
                }

            }

            System.out.print(i+"\t");
            j++;


            if(j%5==0)
               System.out.println();
        }





    }
}
/*
2	3	5	7	11
13	17	19	23	29
31	37	41	43	47
53	59	61	67	71
73	79	83	89	97
 */