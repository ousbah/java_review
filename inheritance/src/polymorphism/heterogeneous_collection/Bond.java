package polymorphism.heterogeneous_collection;

public class Bond extends Security {
	
	private String name, maturityDate;
    private float investedAmount;

    public void setName(String name) {
        this.name = name;
    }

    public void setInvestedAmount(float investedAmount) {
        this.investedAmount = investedAmount;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public void printDescription() {
        System.out.println("Investments in Bonds");
        super.printDescription();
        System.out.println("Bond name: " + name);
        System.out.printf("Invested Amount: $%.02f%n", investedAmount);
        System.out.println("Maturity Date: " + maturityDate);
    }

    public float getNetWorth() {
        return investedAmount;
    }
}
