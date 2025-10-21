package Unit1.part2;

// encapsulation

public class Chicken {
    // data -- private
    private int age;
    private boolean canFly;

    // constructor(s)
    public Chicken(int a, boolean c) {
        age = a;
        this.canFly = c;
    }
    public Chicken() {
        age = 0;
        canFly = false;
    }

    // methods -- public
    // accessors -- getters
    public int getAge() {
        return age;
    }
    public boolean isCanFly() {
        return canFly;
    }
    // modifiers -- changers -- setters
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // toString()
    public String toString() {
        String str = "";
        str += "Age: " + age + " ";
        str += "CanFly: " + canFly + " ";
        return str;
    }

}
