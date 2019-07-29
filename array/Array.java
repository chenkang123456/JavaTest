package Array;

public class Array
{ public static void main(String[] args){
    int[] numbers = new int[50];
    for(int i = 0, j = (numbers[i] == 0?1:numbers[i]); i < 50 && j < 101; j++){
        if(j % 2 == 1){ numbers[i] = j; i++;
        }
    } int count = 0;
    for(int number: numbers){
        System.out.print(number + "\t");
        count++; if(count == 8){
            System.out.println();
            count = 0;
        } } }}