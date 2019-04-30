class Punctuation extends SentenceMember{
    private String symbol;

    Punctuation(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }
}
