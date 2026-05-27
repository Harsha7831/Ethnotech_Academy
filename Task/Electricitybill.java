class Electricitybill{
	public static void main(String[] args){
		int units = 350;
		System.out.prinln("Electricty bill " + eleBill(units));
		int n = 5;
		PyramidPat(n);
	}
	int eleBill(int units){
		return ((units > 250) & true) ? units - 250 : 0;
	}
}