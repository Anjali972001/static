abstract class vehicle {
    int no_of_tyres;
    abstract void start();
}
class car extends vehicle{
    void start()
    {
        System.out.println("A car has 4 or more seats.");
    }
}
class scooter extends vehicle{
    void start(){
        System.out.println("Scooter is only suitable for 2 people.");
    }

    public static void main(String[] args) {
        car c = new car();
        c.start();
        scooter s = new scooter();
        s.start();
    }
}
