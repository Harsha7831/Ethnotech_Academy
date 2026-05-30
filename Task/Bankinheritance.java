class Bankinheritance
{
    private String name;
    private int id;
    private String gender;
    private int amount;

    public Bankinheritance(String name, int id, String gender, int amount)
    {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.amount = amount;
    }

    public int getAmount()
    {
        return amount;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Gender: " + gender);
        System.out.println("Amount: " + amount);
    }
}

class Deposit extends Bankinheritance
{
    private int baltodep;

    public Deposit(String name, int id, String gender, int amount, int baltodep)
    {
        super(name, id, gender, amount);
        this.baltodep = baltodep;
    }
	public void money()
	{
		System.out.println("Money to deposit:"+this.baltodep);
	}
    public int balance()
    {
        return getAmount() + baltodep;
    }
}
class Withdraw extends Bankinheritance
{
	private int baltowit;
	
	public Withdraw(String name, int id, String gender, int amount,int baltowit)
	{
		super(name, id, gender, amount);
		this.baltowit = baltowit;
	}
	public void show()
	{
		System.out.println("Balance to withdraw:"+this.baltowit);
	}
	public int rembal()
	{
		return getAmount() - baltowit;
	}
}
class Main
{
    public static void main(String[] args)
    {
        Deposit d = new Deposit("Harsha", 101, "Male", 5000, 2000);

        d.display();
        d.money();
        System.out.println("Total Balance: " + d.balance());

        System.out.println();

        Withdraw w = new Withdraw("Harsha", 101, "Male", 5000, 2000);

        w.display();
        w.show();
        System.out.println("Remaining Balance: " + w.rembal());
    }
}