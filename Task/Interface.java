interface Upipay
{
	void upipaym();
}
interface Cashpay
{
	void cashpaym();
}
class UpiandCash implements Upipay,Cashpay
{
	public void upipaym()
	{
		System.out.println("Payment happened through online..");
	}
	
	public void cashpaym()
	{
		System.out.println("Payment happened directly..");
	}
}
class Interface
{
	public static void main(String args[])
	{
		UpiandCash uc = new UpiandCash();
		uc.upipaym();
		uc.cashpaym();
	}
}