 
 /*
 
 Just the function implementation
 
 
 */
 
 
 long stringLong(String s)
	{
		return stringToLong(s);
	}
	
	long stringToLong(String s)
	{
		boolean isNegative;
		isNegative = s.charAt(0)=='-';
		
		int startIndex;
		if(isNegative)
			startIndex = 1;
		else
			startIndex = 0;
		
		
		long value = 0;
		for(int i = startIndex; i<s.length();i++)
		{
			value *=10;
			value+=(s.charAt(i)-'0');
			
		}
		
		if(isNegative)
			return value*-1;
		return value;
		
		
	}
	
	/*
	
	Test cases used on this method
	*/
	@Test
	public void testStringToLong() {
		
		Functions f = new Functions();
		
		//Test given input +/-
		assertEquals(123L,f.stringLong("123"));
		assertEquals(-123L,f.stringLong("-123"));
		
		//Test 0
		assertEquals(0L,f.stringLong("0"));
		
		//Test Small Values for -/+
		assertEquals(1L,f.stringLong("1"));
		assertEquals(-1L,f.stringLong("-1"));
	
		//Test large Values -/+
		assertEquals(10500000L,f.stringLong("10500000"));
		assertEquals(-10500000L,f.stringLong("-10500000"));
		
		
	}
	
