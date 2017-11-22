package com.xl.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		try {
			System.out.println(testException(1, 0));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static int testException(int a, int b) throws Exception{
		 int c = 0;
		 try{
			 c = a/b;
			 return c;
		 }catch (ArithmeticException e) {
			 throw new Exception();
			 
		 }catch (Exception e) {
			 throw new Exception();
		}finally {
			return 5;
		}
	}
	
	public static int midProcess(int a, int b) throws Exception{
		return testException(a, b);
	}

}
