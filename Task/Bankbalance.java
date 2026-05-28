class Bankbalance
{
	private int amount;
	
	public void setBal(int amount)
	{
		this.amount = amount;
	}
	public int getBal()
	{
		return amount;
	}
	public static void main(String args[])
	{
		Bankbalance balance = new Bankbalance();
		balance.setBal(16749);
		int res = balance.getBal();
		System.out.println("Balance:"+res);
	} 
}
