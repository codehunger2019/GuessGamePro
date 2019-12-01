import java.util.Scanner;
import java.util.Random;
class GuessGame1
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
Random rd=new Random();
System.out.println("Guess the number between 0 to 9");
int un=sc.nextInt();
int rn=rd.nextInt();
if(rn==un)
System.out.println("You won the Game");
else
System.out.println("You lose the game!! it was "+un);
}
}


