import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		Musicbean mb=new Musicbean();
		MusicDb md=new MusicDb();
		int input=0;
		String ch,ch1;
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1 to play a song");
		System.out.println("press 2 to search a song");
		System.out.println("press 3 to show all song");
		System.out.println("press 4 to operate on song");
		System.out.println("enter your choice");
		input=sc.nextInt();
		switch(input){
			case 1:	System.out.println("press A to play all");
					System.out.println("press B to play songs Randomly");
					System.out.println("press C to play a particular song");
					System.out.println("enter your choice");
					ch=sc.next();
					sc.nextLine();
					switch(ch) {
					case "A":	md.playAll();
								break;
					case "B":	md.playRandom();
								break;
					case "C": 	System.out.println("enter song title");
								String sname=sc.next();
								sc.nextLine();
								md.playParticular(sname);
								break;
					default : 	break;
					}
								break;
			case 2: System.out.println("search");
					System.out.println("enter song id");
					long sid1=sc.nextLong();
					sc.nextLine();
					md.searchMusic(sid1);
					break;
			case 3: System.out.println("show all songs");
					md.showAllMusic();
					break;
			case 4:	System.out.println("press A to add songs on repository");
					System.out.println("press B to edit an existing song");
					System.out.println("press C to delete an existing song");
					System.out.println("enter your choice");
					ch1=sc.next();
					switch(ch1) {
					case "A": md.addMusic(mb);
								break;
					case "B": md.editMusic(mb);
								break;
					case "C": md.delMusic(mb);
								break;
					default : break;
					}
			default : break;
			
				
		}
	}
}
