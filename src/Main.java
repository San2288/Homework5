public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2017;
        boolean clientNewVersion = clientDeviceYear <= 2022 && clientDeviceYear >= 2015;
        if (clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения по ссылке");
        }
        if (clientNewVersion) {
            System.out.println("Установить приложение по ссылке");
        }
    }
}