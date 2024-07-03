class shape{
    public void area(){
        System.out.println("display area");
    }
}

class traingle extends shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class quilateraltraingle extends traingle{
    public void area(int l , int h){
        System.out.println();
    }
}

class Circle extends quilateraltraingle{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}


public class inherit {
    public static void main(String[] args) {
        bank newbank = new bank();
        String result = newbank.name();
        System.out.println(result);
    }
}
