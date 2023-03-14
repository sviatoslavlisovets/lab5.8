import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int currentFloor = 1; // початковий поверх
        int destinationFloor;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ви знаходитесь на " + currentFloor + " поверсі. Введіть номер поверху (1-9): ");
            destinationFloor = scanner.nextInt();

            // перевіряємо, чи не натиснута кнопка 2-го поверху
            if (destinationFloor == 2) {
                System.out.println("Кнопка 2-го поверху не працює. Доставка на 3-й поверх...");
                destinationFloor = 3; // доставка на 3-й поверх
            }

            // рухаємо ліфт вгору або вниз в залежності від вибраного поверху
            if (destinationFloor > currentFloor) {
                for (int i = currentFloor; i < destinationFloor; i++) {
                    System.out.println("Ви піднялись на " + (i + 1) + " поверх");
                }
            } else if (destinationFloor < currentFloor) {
                for (int i = currentFloor; i > destinationFloor; i--) {
                    System.out.println("Ви спустились на " + (i - 1) + " поверх");
                }
            } else {
                System.out.println("Ви вже знаходитесь на цьому поверсі");
            }

            currentFloor = destinationFloor; // оновлюємо поточний поверх
        }
    }
}