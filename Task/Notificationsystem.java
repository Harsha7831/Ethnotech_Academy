interface Notifications
{
	void sendMessages(String message);
}
class Mobilenotifi implements Notifications
{
	public void sendMessages(String message)
	{
		System.out.println("You have a new notification.."+message);
	}
}
class Emailnotify implements Notifications
{
	public void sendMessages(String message)
	{
		System.out.println("You have a new email notification.."+message);
	}
}
class Instanotify implements Notifications
{
	public void sendMessages(String message)
	{
		System.out.println("You have a new Instagram notification.."+message);
	}
}
class Whatsappnotify implements Notifications
{
	public void sendMessages(String message)
	{
		System.out.println("You have a new Whatsapp notification.."+message);
	}
}
class Jobnotify implements Notifications
{
	public void sendMessages(String message)
	{
		System.out.println("You have a new job offer.."+message);
	}
}
class Notificationsystem
{
	public static void main(String args[])
	{
		Mobilenotifi m = new Mobilenotifi();
		Emailnotify e = new Emailnotify();
		Instanotify i = new Instanotify();
		Whatsappnotify w = new Whatsappnotify();
		Jobnotify j = new Jobnotify();
		m.sendMessages("New Mobile Notification");
		e.sendMessages("New Email Notification");
		i.sendMessages("New Instagram Notification");
		w.sendMessages("New Whatsapp Notification");
		j.sendMessages("New Job Notification");
	}
}