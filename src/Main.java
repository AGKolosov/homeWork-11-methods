import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Task-1");
        int year = 2085;
        checkLeapYear(year);
        System.out.println("Task-2");
        int clientOS = 1;
        int clientDeviceYear = 2025;
        recommendAppVersion(clientOS, clientDeviceYear);
        System.out.println("Task-3");
        int deliveryDistance = 102;
        int deliveryDays = calculateDeliveryDays(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет!");
        }
    }
    // method checkLeapYear
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — не високосный год");
        }
    }
    // method recommendAppVersion
    public static void recommendAppVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS == 0) {
                System.out.println("Установите приложение для iOS по ссылке");
            } else if (clientOS == 1) {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }
    }
    // method calculateDeliveryDays
    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}