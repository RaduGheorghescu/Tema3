package seriaf.poo.tema3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws TimeoutException {
        System.out.println("Hello World!");
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        GameEngine gameEngine = new GameEngine(random.nextInt(100-1)+1, 10);
        while (true){
            int value = keyboard.nextInt();
            System.out.println(gameEngine.guess(value));
        }
    }
}
