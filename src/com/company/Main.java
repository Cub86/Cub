public class Main {
    public static void main(String[] args) {
        int x, y;
        x = square(5);
        System.out.println(x);
        x = square(9);
        System.out.println(x);
        y = 2;
        x = square(y);
        System.out.println(x);
    }

    public static int square(int i) {
        return i * i;
    }
}
