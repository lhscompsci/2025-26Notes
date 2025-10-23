package Unit1.part4;

public class StringyThings {

    public static void main(String[] args){

        String str1 = "abc";
        String score = new String("CompSci Rox!");
        String str2 = "abc";
        String str3 = new String("abc");


        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str3));
        // Strings are immutable
        str1 = "xyz";
        System.out.println(score.charAt(4));
        System.out.println(score.length());
        System.out.println(score.substring(3));
        System.out.println(score.substring(2,10));  //up to but not including the ending loc
        System.out.println(score.indexOf("o"));
        int loc = score.indexOf("o");
        System.out.println(score.indexOf("o",loc+1));
        System.out.println(score.indexOf("mpS"));
        System.out.println(score.indexOf("b"));
        System.out.println(score.lastIndexOf("o"));

        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        str3 = str3 + "d";
        System.out.println(str3);
        System.out.println(str3.compareTo(str2));
        System.out.println(str2.compareTo(str3));

        //Parsing strings to numbers
        String nums = "123";
        int val = Integer.parseInt(nums);
        val +=10;
        System.out.println(val);
        double d = Double.parseDouble(nums);
        System.out.println(d);


    }
}
