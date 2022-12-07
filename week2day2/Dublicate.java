package week2day2;

public class Dublicate
{
	public static void main(String[] args) {
		   int[] num= {1,12,11,1,8,21,8};
		   for(int i=0;i < num.length;i++)
		   {
			   for(int j=i+1;j< num.length;j++)
			   {
				   if(num[i]==num[j])
				   {
					   System.out.println(num[i]);
				   }
			   }
				   
			   }
		   }

}
