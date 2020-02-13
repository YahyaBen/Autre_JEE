package main;

public class CalculateurImpl implements Calculateur{
	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int add(int a, int b) {
		int res = a;
		if (b > 0) {
			while(b-- != 0) {
	                        res++;
	                }
	        }
		else if (b < 0) {
			while(b++ != 0) {
	                        res--;
	                }
	        }
		return res;
	}
	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
