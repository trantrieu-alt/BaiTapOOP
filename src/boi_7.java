public class boi_7 {
    public static void main(String[] args) {
        int sum = 0;
        int size = 100;

        for (int i = 7; i <= size; i += 7) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println("\nTong cac boi so cua 7 tu 1 den 100 la: " + sum);
    }
}