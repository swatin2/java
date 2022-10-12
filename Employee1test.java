class Employee1test{
	
	public static void main(String [] args){
	
		int p = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		int s = Integer.parseInt(args[3]);
		
		Employee1 emp = new Employee1(p,q,r,s);
		System.out.printf("your net income is = %f%n",emp.getNetIncome());
		emp.printdetails();
	}
}
