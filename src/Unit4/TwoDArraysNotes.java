package Unit4;

import java.util.Arrays;

import static java.lang.System.out;

public class TwoDArraysNotes {
    public static void main(String[] args) {
//  Matrices aka 2-D Arrays
        int[][] mat =   {{5,7},             //jagged
                        {5,3,4,6},
                        {0,8,9}};
                                //[row][column]
        int[][] numbers = new int[4][2];    //rectangular
        Arrays.fill(numbers[0],5);
        Arrays.fill(numbers[1],7);
        Arrays.fill(numbers[2],8);
        Arrays.fill(numbers[3],9);
        out.println(Arrays.toString(numbers[0]));
        out.println();
        for(int[] nums: numbers){
            out.println(Arrays.toString(nums));
        }
        String[][] names = new String[4][2];
        Arrays.fill(names[0],"John");
        for(String[] name: names){
            out.println(Arrays.toString(name));
        }
        out.println();
        out.println(numbers[2][0]);

        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                sum += numbers[i][j];
            }
        }
        out.println(sum);
        int product = 1;
        numbers[0][0] = 0;
        for(int[] nums: numbers){
            for(int val:nums){
                product *= val;
            }
        }
        out.println(product);
        for(int[] nums: numbers){
            out.println(Arrays.toString(nums));
        }
        out.println(numbers);
    }
}
