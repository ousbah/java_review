package polymorphism.heterogeneous_collection;

public class RealEstate extends Asset {

	private String name;
    private float builtUpArea;
    private float currentMarketRate;

    public void setName(String name) {
        this.name = name;
    }

    public void setBuiltUpArea(float builtUpArea) {
        this.builtUpArea = builtUpArea;
    }

    public void setCurrentMarketRate(float currentMarketRate) {
        this.currentMarketRate = currentMarketRate;
    }

    public void printDescription() {
        System.out.println("Real Estate");
        super.printDescription();
        System.out.println("Name: " + name);
        System.out.printf("Built-up Area: sq.ft. %.02f%n", builtUpArea);
        System.out.printf("Current Market Rate(per sq.ft.): $%.02f%n", currentMarketRate);
        System.out.printf("Net worth: $%.02f%n", + builtUpArea * currentMarketRate);
    }

    public float getNetWorth() {
        return builtUpArea * currentMarketRate;
    }
}
