import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int last = prompt.nextInt();
        prompt.close();
        for (int i = 1; i <= last; i++) {
            String pyramid = String.valueOf(i).repeat(i);
            System.out.println(pyramid);
        }

    }
}
