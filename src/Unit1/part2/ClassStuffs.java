package Unit1.part2;

public class ClassStuffs {

    public static void main(String[] args) {
        //instantiation
        Chicken bob = new Chicken();
        Chicken sue = new Chicken(3,true);
        bob.setAge(30);
        bob.setCanFly(true);

        System.out.println(bob.getAge());
        System.out.println(bob.isCanFly());
        System.out.println(bob);// looks up the toString()
        System.out.println(sue);
    }
}
