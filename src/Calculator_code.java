

public class Calculator_code {

	private int first;
	private int second;
	public String Solve(String user_input)
	{
		String rt=solve_between_brackets('('+user_input+')');
		
		if(rt.endsWith(".0") == true )
			rt=rt.substring(0, rt.length()-2);
		return rt; 
	}
	/////////////////////////////////////////////////////////////////////////////////
	private double squa(double d1,double d2)
	{
		String d4=String.valueOf(d1);
		int i=d4.length();
		for(int j=d4.length()-1;j>0;j--)
		{
			if(d4.charAt(j)=='('||d4.charAt(j)=='+'||d4.charAt(j)=='-'||d4.charAt(j)=='/'||d4.charAt(j)=='*'||d4.charAt(j)=='%')
			{
				d4=d4.substring(j,i);
			}
			
		}
		Double d5=Double.valueOf(d4);
		  final double D3=d1;
		for(int c=1;c<d2;c++)
		{
			d5*=D3;
		}
		
		return d5;
		
	}
	////////////////////////////////////////////////////////////////////////////////////

	private String solve_between_brackets(String user_input)
	{
		int f=0;
		for(int i=0; i<user_input.length(); ++i)
		{
			if(user_input.charAt(i)=='(')
			{
				f=i;
			}
			else if(user_input.charAt(i)==')')
			{
				String ans=det_sign(user_input.substring(f+1, i));
				String s1=user_input.substring(0,f);
				String s2=user_input.substring(i+1);
				return solve_between_brackets(s1+ans+s2);
			}
		}
		return user_input;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////
	private double cul_after(String input, int i) {
		
		String str="";
		for(int j=i+1; j<input.length(); ++j)
			if(Character.isDigit(input.charAt(j)) == true  || input.charAt(j)=='.')
			{
				str += input.charAt(j);
				second = j ;
			}
			else break;
		return Double.valueOf(str);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	private double cul_before(String input, int i) {
		
		String str="";
		for(int j=i-1; j>=0; --j)
			if(Character.isDigit(input.charAt(j)) == true  || input.charAt(j)=='.')
			{
				str = input.charAt(j) + str;
				first = j;
			}
			else break;
		
		if(str=="")str="0";
		return Double.valueOf(str);
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	private String mul_div(String input)
	{
		
		for(int i=0; i<input.length(); ++i)
		{
			if(input.charAt(i)=='*' )
			{
				
				double d1=cul_before(input,i);
				double d2;
				if(first>0 && input.charAt(first-1)=='-')
				{
					d1*=-1;
					first--;
				}
				if(input.charAt(i+1)=='-')
				{
					d2=-1*cul_after(input,i+1);
				}
				else
				{
					d2=cul_after(input,i);
				}
				input = input.substring(0,first) +  Double.valueOf(d1*d2).toString() + input.substring(second +1)  ;
				i=-1; //re_cul
			}
			
			////////////////////////////////////////////////////////////////////////////////////////////////////
			else if(input.charAt(i)=='/')
			{
				double d1=cul_before(input,i);
				double d2;
				if(first>0 && input.charAt(first-1)=='-')
				{
					d1*=-1;
					first--;
				}
				if(input.charAt(i+1)=='-')
				{
					d2=-1*cul_after(input,i+1);
				}
				else
				{
					d2=cul_after(input,i);
				}
				input = input.substring(0,first) +  Double.valueOf(d1/d2).toString() + input.substring(second +1)  ;
				i=-1; //re_cul
			}
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////
			else if(input.charAt(i)=='^')
			{
				double d1=cul_before(input,i);
				double d2;
				if(first>0 && input.charAt(first-1)=='-')
				{
					d1*=-1;
					first--;
				}
				if(input.charAt(i+1)=='-')
				{
					d2=-1*cul_after(input,i+1);
				}
				else
				{
					d2=cul_after(input,i);
				}
				input = input.substring(0,first) +  squa(d1,d2) + input.substring(second +1)  ;
				i=-1; //re_cul
			}
			/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
			else 
			if(input.charAt(i)=='%')
			{
				double d1=cul_before(input,i);
				double d2;
				if(first>0 && input.charAt(first-1)=='-')
				{
					d1*=-1;
					first--;
				}
				if(input.charAt(i+1)=='-')
				{
					d2=-1*cul_after(input,i+1);
				}
				else
				{
					d2=cul_after(input,i);
				}
				
				input = input.substring(0,first) +  Double.valueOf(d1/d2).toString() + input.substring(second +1)  ;
				i=-1; //re_cul
			}
					
		}
		return input;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	private String add_sub(String input)
	{
		for(int i=0; i<input.length(); ++i)
		{
			if(input.charAt(i)=='+' )
			{
				double d1=cul_before(input,i);
				double d2=cul_after(input,i);
				input = input.substring(0,first) + Double.valueOf(d1+d2).toString() + input.substring(second +1);
				i=-1;
				
			}
			//////////////////////////////////////////////////////////////////////////////////
			else if(input.charAt(i)=='^')
			{
				double d1=cul_before(input,i);
				double d2;
				if(first>0 && input.charAt(first-1)=='-')
				{
					d1*=-1;
					first--;
				}
				if(input.charAt(i+1)=='-')
				{
					d2=-1*cul_after(input,i+1);
				}
				else
				{
					d2=cul_after(input,i);
				}
				input = input.substring(0,first) +  squa(d1,d2) + input.substring(second +1)  ;
				i=-1; //re_cul
			}
			/////////////////////////////////////////////////////////////////////////////////////////
			else if(input.charAt(i)=='-')
			{
				double d1=cul_before(input,i); 
				double d2=cul_after(input,i);
				input = input.substring(0,first) + Double.valueOf(d1 - d2).toString() + input.substring(second +1);
				if(d1==0)continue;
				i=-1;
			}		
		}
		return input;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	private String det_sign(String input)
	{
		input = mul_div(input);
		input = add_sub(input);
		return input;
	}
	
	
}