package Unit4;

import java.util.ArrayList;  // <-- new import
import java.util.Collections;   // <-- another new import

public class ArrLsNotes {
    public static void main(String[] args){

        // refresher -- Arrays
        String[] names = new String[10];
        //fixed size at 10 total slots
        // what if we need to make it bigger? -- rewrite the code

        //ArrayList -- dynamic array:  it can grow and shrink as we need it to
        ArrayList<String> allTheNames = new ArrayList<>();
        System.out.println(allTheNames.add("A"));
        allTheNames.add("B");
        System.out.println(allTheNames);
        allTheNames.add(1,"C");
        allTheNames.add("D");
        System.out.println(allTheNames);
        String gone = allTheNames.set(0,"E");
        System.out.println(allTheNames);
        System.out.println(gone);
        allTheNames.remove("E");    // boolean:   true if worked, false if didn't
        allTheNames.remove("F");    //not an error, just doesn't happen
        System.out.println(allTheNames);
        allTheNames.add("G");
        allTheNames.add("H");
        System.out.println(allTheNames.get(3));
        System.out.println(allTheNames);
        System.out.println(allTheNames.size());
        System.out.println(allTheNames.contains("j")); //boolean in nature
        System.out.println(allTheNames.indexOf("D"));
        System.out.println(allTheNames.lastIndexOf("D"));
        System.out.println(allTheNames);
        allTheNames.clear();
        System.out.println(allTheNames);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(2,6);
        System.out.println(numbers);
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        System.out.println(sum);
        for( int num: numbers){     //"for each integer num in numbers"
            System.out.println(num);
        }

        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.rotate(numbers,1);  //move to the right one space
        System.out.println(numbers);
        Collections.rotate(numbers,-3); //move everything 3 spaces to the left
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers,5));




    }
}
