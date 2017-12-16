package seriaf.poo.tema3;

public class TimeoutException extends Exception{
    String message = "Time is up! You lose.";

    @Override
    public String getMessage() {
        System.out.println(message);
        return message;
    }
}
