import java.util.*;
class Arraylistscan
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> playlist = new ArrayList<>();
		String first = sc.nextLine();
		String second = sc.nextLine();
		String third = sc.nextLine();
		String fourth = sc.nextLine();
		String fifth = sc.nextLine();
		String sixth = sc.nextLine();
		playlist.add(first);
		playlist.add(second);
		playlist.add(third);
		playlist.add(fourth);
		playlist.add(fifth);
		playlist.add(sixth);
		System.out.println("Before removing:"+playlist);
		playlist.remove(playlist.get(0));
		System.out.println("After removing:"+playlist);
		System.out.println("Size:"+playlist.size());
		System.out.println("Contains:"+playlist.contains("Harsha"));
		System.out.println("Contains:"+playlist.contains("Globetrotter"));
		System.out.println("Replace:"+playlist.set(2,"Timetrotter"));
		Collections.sort(playlist);
		for(String s : playlist)
		{
			System.out.print(s+" ");
		}
	}
}
