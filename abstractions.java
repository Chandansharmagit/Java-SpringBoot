abstract class animals{
    abstract void walk();//abtrat cannot be initiate because it is blur print 
}
class horse extends animals{
    public void walk(){
       System.out.println("horse walk in four legs"); 
    }
}

class man extends horse{
    public void walk(){
        System.out.println("man walk in four legs");
    }
}


public class abstractions {

    public static void main(String[] args) {
        // animals newAnimals = new animals();
        // newAnimals.walk();

        horse newhorse = new horse();
        newhorse.walk();
        
    }
}
