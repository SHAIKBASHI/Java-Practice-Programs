package com.version3;

public class FilterTest {
	public static void main(String args[]) {
		int arr[]= {-11,-20,34,56,78,-98,-146,34,-48,576,-393,100,297,298,11};
		
		ArrayFilter.doFilter(arr,(element)->{return element <0;});
		ArrayFilter.doFilter(arr,(element)->{return element >=0;});
		ArrayFilter.doFilter(arr,(element)->{return element %11==0;});
		ArrayFilter.doFilter(arr,(element)->{return element %11==0 && element >=0;});
		ArrayFilter.doFilter(arr,(element)->{return element <0;});
		ArrayFilter.doFilter(arr,(element)->{return element %9==0;});
	}

}
