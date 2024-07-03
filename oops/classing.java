class Pen {
    String color;
    int n;
    String type;

    Pen(String data, String man, int ns) {
        this.color = data;
        this.type = man;
        this.n = ns;
    }

    public void write() {
        System.out.println("the color of pen is " + this.color + " and the price of pen is " + this.n
                + " and the type is " + this.type);
    }
}

public class classing {
    public static void main(String[] args) {
        Pen newpen = new Pen("red", 23, "gel");

        newpen.pen();

        newpen.write();
    }
}



//destructoe has java it cannot be define because it has already define in java

//polymorphism has two types they are: 1: runtime polymorphism and another 2: compile time polymorphism

