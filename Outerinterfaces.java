/**
 * Innerinterfaces
 */
public interface Innerinterfaces {
    //interface doesnot have body {    }
    public void showdata();
    void namingsound();//by default it is public or abstract
}

/**
 * InnerInnerinterfaces
 */
public interface Outerinterfaces {
    
}


class man implements Innerinterfaces{
    public void showdata(){
        System.out.println("hello world");
    }
}



public class interfaces {
    public static void main(String[] args) {
        
    }
}
