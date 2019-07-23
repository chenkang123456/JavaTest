
public class text08{
    public static void main(String[] args) {
        /* String[] strs = new String[4];
        strs[0]="AA";
        strs[1]="BB";
        strs[2]="CC";
        strs[3]="DD";

        for(int i=0;i<strs.length;i++){
            System.out.println(strs[i]);
        } */

        byte[] scores = new byte[4];
        scores[0] = 88;
        scores[3] = 90;
        for(int i=0;i<scores.length;i++){
            System.out.println(scores[i]);

        }

        float[] f=new float[3];
        f[0] = 8.0F;
        f[1] = 9.0F;

        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }


        Person[] pers = new Person[4];
        for(int i=0;i<pers.length;i++){
            System.out.println(pers[i]);
        }



    } 
}


class Person{

}