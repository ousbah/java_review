package polymorphism.heterogeneous_collection;

public class Security extends Asset {
	
	private String tradeExchangeName;

    public String getTradeExchangeName() {
        return tradeExchangeName;
    }

    public void setTradeExchangeName(String tradeExchangeName) {
        this.tradeExchangeName = tradeExchangeName;
    }

    public void printDescription() {
        super.printDescription();
        System.out.println("Trade Exchange: " + tradeExchangeName);
    }
}
