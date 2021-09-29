package testprogramdebug;
import java.util.Scanner;


public class NumberDebug 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		int x, y, diff, pr_dt, dstn, max, min, sum;
		double avg;

		System.out.println("please type 2 number : ");
		x = input.nextInt();
		y = input.nextInt();

		sum = x+y;
		diff = x-y;
		pr_dt = x*y;
		avg = (double) sum/2 ;
		dstn = Math.abs(diff);
		max = Math.max(x, y);
		min = Math.min(x, y);

		System.out.println("The sum of these 2 number is : " +sum);
		System.out.println("The difference of these 2 number is : " +diff);
		System.out.println("The product of these 2 number is : " +pr_dt);
		System.out.println("The average of these 2 number is : " +avg);
		System.out.println("The distance of these 2 number is : " +dstn);
		System.out.println("The maximum of these 2 number is : " +max);
		System.out.println("The minimum of these 2 number is : " +min);
		}
}
