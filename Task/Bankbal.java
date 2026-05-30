class Bankbal
{
	private int Bal;
	
	public void setBal(int Bal)
	{
		this.Bal = Bal;
	}
	public int getBal()
	{
		return Bal;
	}
	public static void main(String args[])
	{
		Bankbal balance = new Bankbal();
		balance.setBal(16749);
		int res = balance.getBal();
		System.out.println("Balance:"+res);
	} 
}
