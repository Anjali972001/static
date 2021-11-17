public class employee1 {
    int id ;
    String name;
    static String company="Amazon";
    employee1(int id ,String name)
    {
        this.name=name;
        this.id=id;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+company);
    }

    public static void main(String[] args) {
        employee1 e1 =new employee1(123,"Anjali");
        employee1 e2 = new employee1(125,"Aman");
        e1.display();
        e2.display();
    }
}
/* when the variable is declared static then a single copy of variable is created and shared among all the
object of the class.
 */