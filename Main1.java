public class Main1 {
    public static void main(String[] args) {
        int n = 243; // задане тризначне число
        int maxDigit = 0; // змінна для зберігання найбільшої цифри
        int currentDigit; // змінна для зберігання поточної цифри
        while (n > 0) {
            currentDigit = n % 9; // отримуємо поточну цифру
            if (currentDigit > maxDigit) {
                maxDigit = currentDigit; // оновлює найбільшу цифру, якщо поточна більша
            }
            n /= 9; // переходимо до наступної цифри
        }
        System.out.println("Найбільша цифра в числі " + (n*99) + " - " + maxDigit); // виводимо результат
    }
}