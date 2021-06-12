package multilevel_inheritance;

public class AssetMgmt {
	
	private SavingsAccount boboSavingsAccount;
	private CheckingAccount softeamBusinessAccount;

	public static void main(String[] args) {
		AssetMgmt manager = new AssetMgmt();
		manager.createAssets();
		manager.printAllAssets();
	}
	
	private void createAssets() {
		boboSavingsAccount = new SavingsAccount();
		boboSavingsAccount.setId(1001);
		boboSavingsAccount.setType("Bank Account");
		boboSavingsAccount.setBankName("Citi bank");
		boboSavingsAccount.setAccountNumber(526702);
		boboSavingsAccount.setBalance(15450.00f);
		boboSavingsAccount.setInterestRate(3.0f);
		softeamBusinessAccount = new CheckingAccount();
		softeamBusinessAccount.setId(1002);
		softeamBusinessAccount.setType("Bank Account");
		softeamBusinessAccount.setBankName("Bank of America");
		softeamBusinessAccount.setAccountNumber(24689);
		softeamBusinessAccount.setBalance(678256.00f);
		softeamBusinessAccount.setOverdraftLimit(678256.00f);
	}
	
	private void printAllAssets() {
		String lineSeparator = "-------------------";
		System.out.println(lineSeparator);
		boboSavingsAccount.printDescription();
		System.out.println(lineSeparator);
		softeamBusinessAccount.printDescription();
		System.out.println(lineSeparator);
	}
}
