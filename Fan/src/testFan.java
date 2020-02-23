public class testFan {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(true,Fan.Fast,10,"yellow");
        System.out.println(Fan1.getSpeed());
        System.out.println(Fan1.getRadius());
        System.out.println(Fan1.getColor());
        Fan1.checkStatus();

        Fan Fan2 = new Fan(false,Fan.Medium,5,"blue");
        System.out.println(Fan2.getSpeed());
        System.out.println(Fan2.getRadius());
        System.out.println(Fan2.getColor());
        Fan2.checkStatus();
    }
}