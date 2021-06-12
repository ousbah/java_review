package polymorphism.heterogeneous_collection;

public class Stock extends Security {

	private String symbol;
    private float marketPrice;
    private int quantityAtHand;

    public void setMarketPrice(float marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setQuantityAtHand(int quantityAtHand) {
        this.quantityAtHand = quantityAtHand;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void printDescription() {
        System.out.println("Investment in securities");
        super.printDescription();
        System.out.println("Stock: " + symbol);
        System.out.printf("Today's market price: $%.02f%n", marketPrice);
        System.out.printf("Quantity at Hand: %d%n", quantityAtHand);
        System.out.printf("Net worth: $%.02f%n", marketPrice * quantityAtHand);
    }

    public float getNetWorth() {
        return marketPrice * quantityAtHand;
    }
}
