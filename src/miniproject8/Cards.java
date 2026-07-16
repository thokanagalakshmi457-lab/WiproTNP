package miniproject8;

public class Cards {
    private char symbol;
    private int number;
    public Cards(char symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
    public char getSymbol(){
        return symbol;
    }
    public int getNumber(){
        return number;
    }
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }
    public void setNumber(int number){
        this.number = number;
    }
}