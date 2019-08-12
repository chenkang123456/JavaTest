package com.arraylist0811;

public class Main {
/*
 * 当 "=="运算符的两个操作数都是 包装器类型的引用，则是比较指向的是否是同一个对象，
 * 而如果其中有一个操作数是表达式（即包含算术运算）则比较的是数值（即会触发自动拆箱的过程）。
 * 另外，对于包装器类型，equals方法并不会进行类型转换。
 */
	public static void main(String[] args) {
		Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
         
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
        
        /*
         * 第一个和第二个输出结果没有什么疑问。第三句由于  a+b包含了算术运算，因此
         * 会触发自动拆箱过程（会调用intValue方法），因此它们比较的是数值是否相等。
         * 而对于c.equals(a+b)会先触发自动拆箱过程，再触发自动装箱过程，也就是
         * 说a+b，会先各自调用intValue方法，得到了加法运算后的数值之后，便调用
         * Integer.valueOf方法，再进行equals比较。同理对于后面的也是这样，
         * 不过要注意倒数第二个和最后一个输出的结果（如果数值是int类型的，装箱过程调
         * 用的是Integer.valueOf；如果是long类型的，装箱调用的Long.valueOf方法）。
         */

	}

}
