

public class scentific_calculation {

	Calculator_code cal = new Calculator_code();
	
	/**  calculator scientific operation by loop of string input between  Brackets where  the string any scientific operation (cos ,sin,tan,tan-1,cos-1,sin-1)
	 * @param s value input from user
	 * @return string value T
	 */
	String filter(String s)
	{
		String T="";
		
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-1) 
				t = s.substring(i,i+1);
			if(t.equals("!")) 
			{
				int j,o=1,c=0; 
				for(j=i+2 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+1, j);
				String R = cal.Solve(r);
				double d = fact(Double.valueOf(R));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+1;
			}
			else  { T+=s.charAt(i);  i++; 
			      }
		}
		
//////////////////////////////////////////////////////		
		if(!T.isEmpty()) s=T;
		T="";
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-2) t = s.substring(i,i+2);
			if(t.equals("ln")) 
			{
				int j,o=1,c=0; 
				for(j=i+3 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+2, j);
				String R = cal.Solve(r);
				double d = Math.log(Double.valueOf(R));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+2;
			}
			else  { T+=s.charAt(i);  i++; }
		}
		
//////////////////////////////////
		
		if(!T.isEmpty()) s=T;
		T="";
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-3) t = s.substring(i,i+3);
			if(t.equals("log")) 
			{
				int j,o=1,c=0; 
				for(j=i+4 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+3, j);
				String R = cal.Solve(r);
				double d = Math.log10(Double.valueOf(R));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+3;
			}
			else  { T+=s.charAt(i);  i++; }
		}
		
	/////////////////////////////////////////////////////
		
		if(!T.isEmpty()) s=T;
		T="";
		
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-5) t = s.substring(i,i+5);
			if(t.equals("sin-1 ")) 
			{
				int j,o=1,c=0; 
				for(j=i+6 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+5, j);
				String R = cal.Solve(r);
				double d = Math.asin(Math.toRadians(Double.valueOf(R)));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+5;
			}
			else  { T+=s.charAt(i);  i++; }
		}

////////////////////////////////////////////////////
		if(!T.isEmpty()) s=T;
		T="";
		
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-5) t = s.substring(i,i+5);
			if(t.equals("cos-1 ")) 
			{
				int j,o=1,c=0; 
				for(j=i+6 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+5, j);
				String R = cal.Solve(r);
				double d = Math.cosh(Math.toRadians(Double.valueOf(R)));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+5;
			}
			else  { T+=s.charAt(i);  i++; }
		}

//////////////////////////////////////////////////////
		if(!T.isEmpty()) s=T;
		T="";
		
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-5) t = s.substring(i,i+5);
			if(t.equals("tan-1 ")) 
			{
				int j,o=1,c=0; 
				for(j=i+6 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+5, j);
				String R = cal.Solve(r);
				double d = Math.tanh(Math.toRadians(Double.valueOf(R)));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+5;
			}
			else  { T+=s.charAt(i);  i++; }
		}

//////////////////////////////////////////////////////
		
		if(!T.isEmpty()) s=T;
		T="";
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-3) t = s.substring(i,i+3);
			if(t.equals("sin")) 
			{
				int j,o=1,c=0; 
				for(j=i+4 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+3, j);
				String R = cal.Solve(r);
				double d = Math.sin(Math.toRadians(Double.valueOf(R)));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+3;
			}
			else  { T+=s.charAt(i);  i++; }
		}
//////////////////////////////////////////////////////
		if(!T.isEmpty()) s=T;
		T="";
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-3) t = s.substring(i,i+3);
			if(t.equals("cos")) 
			{
				int j,o=1,c=0; 
				for(j=i+4 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+3, j);
				String R = cal.Solve(r);
				double d = Math.cos(Math.toRadians(Double.valueOf(R)));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+3;
			}
			else  { T+=s.charAt(i);  i++; }
		}
	/////////////////////////////////////////////////////////
		if(!T.isEmpty()) s=T;
		T="";
		
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-3) t = s.substring(i,i+3);
			if(t.equals("tan")) 
			{
				int j,o=1,c=0; 
				for(j=i+4 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+3, j);
				String R = cal.Solve(r);
				double d = Math.tan(Math.toRadians(Double.valueOf(R)));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+3;
			}
			else  { T+=s.charAt(i);  i++; }
		}
		
	//////////////////////////////////////////////////////
		if(!T.isEmpty()) s=T;
		T="";
		
		for(int i=0 ; i<s.length() ; )
		{
			String t="";
			if(i<s.length()-4) t = s.substring(i,i+4);
			if(t.equals("sqrt")) 
			{
				int j,o=1,c=0; 
				for(j=i+4 ; j<s.length() ; j++)
				{
					if(o==c) break;
					if(s.charAt(j)=='(') o++;
					if(s.charAt(j)==')') c++;				
				}
				String r = s.substring(i+4, j);
				String R = cal.Solve(r);
				double d = Math.sqrt(Double.valueOf(R));
				T+='('+String.valueOf(d)+')';
				i+=r.length()+4;
			}
			else  { T+=s.charAt(i);  i++; }
		}
		
		return (T.isEmpty()) ? s : T;
	}
	
	
	/** function solve any operation input from user there coal function filter
	 * @param input  string  from user    
	 * @return string result of operation 
	 */
	public String solve(String input)
	{
		return cal.Solve(filter(input));
	}
	
	/**function fact calculator fact when  value less than 2 calculator n(n-1)*(n-2).....*(n)
	 * @param n double from user
	 * @return fact of value input
	 */
	double fact(double n)
	{
		if(n<2) return n;
		return n*fact(n-1);
		
	}
	
	/**function calculator n^2=n*n when n is value input  
	 * @param n double value from user
	 * @return double n*n
	 */
	double square(double n)
	{
	
		return n*n;
		
	}
	
}
