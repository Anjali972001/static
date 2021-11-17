public class employee {
    int id;
    String name;
    String company;
    employee(int id, String name,String company)
    {
        this.id=id;
        this.name=name;
        this.company=company;
    }
    void display(){
        System.out.println(id+" "+name+" "+company);
    }

    public static void main(String[] args) {
        employee e1 = new employee (1234,"Anjali","Amazon");
        employee e2= new employee (12233,"Aman","Amazon");
        e1.display();
        e2.display();
    }
}
