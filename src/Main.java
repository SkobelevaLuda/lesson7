import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> kass1= new ArrayDeque<>();
         Queue<String> kass2= new ArrayDeque<>();
        Supermarket.randomFill(kass1);
        Supermarket.randomFill(kass2);
        System.out.println(" Первая очередь: "+kass1);
        System.out.println(" Вторая очередь: "+kass2);

        Supermarket.add("Даша",kass1,kass2);
        System.out.println(" Первая очередь: "+kass1);
        System.out.println(" Вторая очередь: "+kass2);

        Supermarket.remove(kass1,kass2);
        System.out.println(" Первая очередь: "+kass1);
        System.out.println(" Вторая очередь: "+kass2);



    }
}