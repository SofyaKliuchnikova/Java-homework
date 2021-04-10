package Homework6;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    Controller controller = new Controller();

    public void runInterface(){
        Scanner scanner = new Scanner(System.in);

        outer: while (true){
            System.out.println("Введите название города");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для получения текущей погоды или 2 для получения прогноза на 5 дней");
            System.out.println("Для выхода из программы введите end");
            String command = scanner.nextLine();

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
        }
    }
}
