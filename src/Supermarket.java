import java.util.*;

public class Supermarket {

    private Queue<String> kass1= new ArrayDeque<>();
    private Queue<String> kass2= new ArrayDeque<>();

    private static final List<String> NAMES =List.of(
            "Аня","Катя","Витя","Женя","Таня", "Маня","Леша","Вова","Оля"," Сережа"
    );
    private static final Random RANDOM = new Random();


    public static void randomFill(Queue<String>queue){
        int size = RANDOM.nextInt(MAX_SIZE+1);
        for (int i = 0; i <size ; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
            
        }

    }

    private static final int MAX_SIZE=5;
    static void add(String name,
                    Queue<String> kass1,
                    Queue<String> kass2){
        if (kass1.size()<kass2.size()&& kass1.size()!= MAX_SIZE){
            kass1.offer(name);
        }else if (kass2.size()<kass1.size()&& kass2.size()!= MAX_SIZE) {
            kass2.offer(name);
        }else {
            System.out.println(" Нужно позвать Галю!");
        }

    }
    static void remove(Queue<String> kass1,
                       Queue<String> kass2){
        if (RANDOM.nextBoolean()){
            kass1.poll();
        }else {
            kass2.poll();
        }
    }

}
