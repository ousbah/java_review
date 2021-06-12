package polymorphism.heterogeneous_collection;

public class PortfolioManager {

	Asset[] boboAssets = new Asset[5];

	public static void main(String[] args) {
		PortfolioManager manager = new PortfolioManager();
		manager.createAssets();
		manager.raiseSavingsInterest();
		manager.printAllAssets();
		manager.printNetWorth();
		
	}

	private void createAssets() {
		SavingsAccount boboSavingsAccount = new SavingsAccount();
		boboSavingsAccount.setId(1001);
		boboSavingsAccount.setType("Bank Account");
		boboSavingsAccount.setBankName("Citi bank");
		boboSavingsAccount.setAccountNumber(526702);
		boboSavingsAccount.setBalance(15450.00f);
		boboSavingsAccount.setInterestRate(3.0f);
		boboAssets[0] = boboSavingsAccount;
		CheckingAccount softeamBusinessAccount = new CheckingAccount();
		softeamBusinessAccount.setId(1002);
		softeamBusinessAccount.setType("Bank Account");
		softeamBusinessAccount.setBankName("Bank of America");
		softeamBusinessAccount.setAccountNumber(24689);
		softeamBusinessAccount.setBalance(678256.00f);
		softeamBusinessAccount.setOverdraftLimit(50000.00f);
		boboAssets[1] = softeamBusinessAccount;
		Stock ibmStocks = new Stock();
		ibmStocks.setId(5001);
		ibmStocks.setType("Security");
		ibmStocks.setTradeExchangeName("NYSE");
		ibmStocks.setSymbol("IBM");
		ibmStocks.setQuantityAtHand(100);
		ibmStocks.setMarketPrice(129.61f);
		boboAssets[2] = ibmStocks;
		Bond appleBonds = new Bond();
		appleBonds.setId(6000);
		appleBonds.setType("Bonds");
		appleBonds.setTradeExchangeName("NYSE");
		appleBonds.setName("Apple Inc");
		appleBonds.setInvestedAmount(25000.00f);
		appleBonds.setMaturityDate("01/01/2015");
		boboAssets[3] = appleBonds;
		RealEstate texasEstate = new RealEstate();
		texasEstate.setId(8000);
		texasEstate.setType("Real Estate");
		texasEstate.setName("House in Texas");
		texasEstate.setBuiltUpArea(2250);
		texasEstate.setCurrentMarketRate(950.00f);
		boboAssets[4] = texasEstate;
		
		String lineSeparator = "-------------------";
		
		for (Asset asset : boboAssets) {
		    if (asset instanceof SavingsAccount) {
		        // do something with savings account
		        System.out.println("Savings Account found");
		    } else if (asset instanceof BankAccount) {
		        // do something with bank account
		        System.out.println("Bank Account found");
		    } else if (asset instanceof Asset) {
		        // do something with Asset
		        System.out.println("Asset found");
		    }
		}
		System.out.println(lineSeparator);
		
//		for (Asset asset : boboAssets) {
//		    if (asset instanceof Asset) {
//		        // do something with Asset
//		        System.out.println("Asset found");
//		    } else if (asset instanceof BankAccount) {
//		        // do something with bank account
//		        System.out.println("Bank Account found");
//		    } else if (asset instanceof SavingsAccount) {
//		        // do something with savings account
//		        System.out.println("Savings Account found");
//		    }
//		}
//		System.out.println(lineSeparator);
	}

	// iterates through the elements of assets array and call printDescription()
	// on each element of the array
	private void printAllAssets() {
		String lineSeparator = "-------------------";
		System.out.println("Entire Portfolio");
		for (Asset asset : boboAssets) {
			System.out.println(lineSeparator);
			// runtime polymorphism: the runtime decides which implementation
			// of printDescription() to call (the runtime calls an appropriate
			// version of the overridden method)
			asset.printDescription();
		}
		System.out.println(lineSeparator);
	}

	// computes the total value of all the assets in the heterogeneous
	// collection and prints it to the console
	private void printNetWorth() {
		float total = 0;
		for (Asset asset : boboAssets) {
			total += asset.getNetWorth();
		}
		System.out.println("Net Worth of Bobo's entire portfolio: $" + total);
	}
	
	// raises the interest rate of all SavingsAccount
	private void raiseSavingsInterest() {
		for (Asset asset : boboAssets) {
			if (asset instanceof SavingsAccount) {
				((SavingsAccount) asset).setInterestRate(4.5f);
				break;
			}
		}
	}
}
