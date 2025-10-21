package Unit1.part1;

public class MathStuffs {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 55;

        System.out.println(a +  b + c);
        System.out.println(a - c);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(c / a);  //integer division always gives just quotient
        System.out.println(c % b);  //remainder == modulus...kinda

        double g = 43;

        System.out.println(g + a);
        System.out.println(g - b);
        System.out.println(g * a);
        System.out.println(g / b);
        System.out.println(g % b);

        //casting
        System.out.println((double)c / b);

        //Math class
        System.out.println(Math.floor(5.78));
        System.out.println(Math.ceil(5.78));
        System.out.println(Math.floor(-5.78));
        System.out.println(Math.ceil(-5.78));
        System.out.println(Math.sqrt(27));
        System.out.println(Math.cbrt(27));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.random());  //gives you a random val [0,1)

        //roll a die
        System.out.println( (int)(Math.random()*6) + 1 );
        //generate a random int [-5,10]
        System.out.println( (int)(Math.random()* 16) + -5  );

        //shortcuts
        System.out.println(a);
        a++;    //incrementor
        System.out.println(a);
        a--;    //decrementor
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);

        b -= 32;    //b = b - 32
        System.out.println(b);
        // *=    /=    %=    +=

    }

}
