public class text03{
    public static void main(String[] args) {
        int i2 = 90;
        int i3 = 0;
        if (i2 > 89)               //判断i2是否大于89，是的话将i2 - 10赋值给i3;否则的话将i2+2赋值给i3并将i3+1赋值给我i3;输出i3
            i3 = i2 - 10;
        else
            i3 = i2 + 2;
            i3++;
        System.out.println("i3=" + i3);
    }
}