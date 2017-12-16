package seriaf.poo.tema3;


public class GameEngine {
    private int valueToGuess;
    private int secondsAvailable;
    private GuessResult guessResult;

    private Thread loop = new Thread(
            () -> {
                try {
                    Thread.sleep(1000);
                    Thread.currentThread().interrupt();
                    guess(-1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (TimeoutException e) {
                    e.getMessage();
                    System.exit(1);
                }
            }
    );

    public GameEngine(int valueToGuess, int secondsAvailable) {
        this.valueToGuess = valueToGuess;
        this.secondsAvailable = secondsAvailable;
        this.guessResult = new GuessResult(valueToGuess);
        loop.start();
    }

    GuessResult guess(int value) throws TimeoutException{
        if(loop.isInterrupted()){
            throw new TimeoutException();
        }
        guessResult.setLastValue(value);
        return this.guessResult;
    }
}
