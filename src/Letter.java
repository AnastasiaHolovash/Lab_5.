public class Letter {
    private char symbol;

    Letter(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Letter) {
            return Character.toLowerCase(((Letter) obj).symbol) == Character.toLowerCase(symbol);
        }
        return false;
    }

    @Override
    public String toString() {
        return symbol + "";
    }



}
