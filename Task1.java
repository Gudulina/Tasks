import java.util.Scanner;
// Другой комментарий.
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = input.nextInt();
        System.out.print("Введите второе число: ");
        int y = input.nextInt();
        int sum = x+y;
        System.out.println(x +" + "+y+" = "+ sum);
    }
}
