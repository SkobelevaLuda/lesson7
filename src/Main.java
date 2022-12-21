import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        example();
    }
        private static void example(){
            List<List<String>> biDemArrList = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                biDemArrList.add(i, new ArrayList<>());
                for (int j = 0; j < 8; j++) {
                    biDemArrList.get(i).add(j, ((i + j) % 2 == 1 ? "●" : "◯"));
                }
            }
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(biDemArrList.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }

        /*
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
        System.out.println(" Вторая очередь: "+kass2);*/
    }
