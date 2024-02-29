public class Program_5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i == 10) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
