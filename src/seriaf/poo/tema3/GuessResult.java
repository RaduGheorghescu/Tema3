package seriaf.poo.tema3;

public class GuessResult{
    private boolean isWon;
    private int valueToWin;
    private int lastValue;
    private String stringToReturn;

    public GuessResult(int valueToWin) {
        this.valueToWin = valueToWin;
        this.isWon =  false;
    }

    public boolean isWon(){
      return isWon;
    }

    public void setLastValue(int lastValue) {
        this.lastValue = lastValue;
        if(valueToWin>lastValue){
            this.stringToReturn = "Try HIGHER!";
        }else if(valueToWin<lastValue){
            this.stringToReturn = "Try LOWER!";
        }else {
            this.isWon =  true;
            this.stringToReturn = "Exactly, you WIN!";
        };
    }

    @Override
    public String toString() {
        return stringToReturn;
    }
}
