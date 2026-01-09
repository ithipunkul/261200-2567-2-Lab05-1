public class Lec05 {
    public static void main(String[] args) {
        User john = new User("John",1954,2,18);
        Admin nicolas = new Admin("Nicolas",1964,1,7);
        john.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);
    }
}