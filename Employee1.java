class Employee1{
	private int eid;
	private int age;
	private int hours;
	private double rate;
		
	public Employee1(int id,int age1,int hrs, double r){
		eid=id;
		age=age1;
		hours=hrs;
		rate=r;
	}
	
        public void printdetails(){


          System.out.printf("employee id =%d,age=%d,hours%d,rate%f",eid,age,hours,rate);
         

	}

	public double getNetIncome(){
		if(hours<180){
			return hours*rate;
		}
		else
			return 180*rate + (hours-180)*100;
	}	
}
