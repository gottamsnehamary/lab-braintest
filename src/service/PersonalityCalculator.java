package service;

// Create a class called PersonalityCalculator
// PersonalityCalculator has two methods findAnswers and findYourBrainType
// int[] findAnswers(String options) and String findYourBrainType(String options) is the method prototype
// findAnswer() accepts String as an argument and returns integer array as an output
// findYourBrainType accepts String as an argument and returns String as an output
// option is a string which contains all the options selected as a string
// Use the split method to segregate the options and store it in a string array.
// Convert the string array into an integer array.
// return the entire integer array to findyourBrainType
public class PersonalityCalculator
{
	public int[]  findAnswers(String options)
	{
		int i=0;
		String s[]=options.split(",");
		int n=s.length;
		int a[]=new int[n];
		for (String b : s)
		{
			a[i]=Integer.parseInt(b);
			i++;
		}
		return a;
	}
	public String findYourBrainType(String options)
	{
		int a[]=findAnswers(options);
		int  b=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
		int c= a[3]=a[3]+a[5]+a[6]+a[8]+a[12]+a[14]+a[15]+a[16]+a[18];
		int x=66-b+c;
		if((x>=20)&&(x<=55))
		{
			String str="Left-brained";
			return str;
		}
		if((x>=56)&&(x<=64))
		{
			String str="No clear preference";
			return str;
		}
		if((x>=65)&&(x<=100))
				{
			String str= "Right-brained";
			return  str;
				}
		return options;
	}
}