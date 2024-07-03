class students{
    String name;
    static String firstname;
}


public class methodandstatic {
    public static void main(String[] args) {
        students.firstname = "Sharma";//because this is static method
        students newsStudents = new students();
        newsStudents.name = "tony";
        System.out.println( );

    }
}
